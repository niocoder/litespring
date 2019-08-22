package org.litespring.beans.factory.support;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.litespring.beans.BeanDefinition;
import org.litespring.beans.factory.BeanCreationException;
import org.litespring.beans.factory.BeanDefinitionStoreException;
import org.litespring.beans.factory.BeanFactory;
import org.litespring.beans.factory.config.ConfigurableBeanFactory;
import org.litespring.util.ClassUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 10:27 2019/8/21
 * @Modified By:
 * @Version:
 */
public class DefaultBeanFactory extends DefaultSingletonBeanRegistry
		implements ConfigurableBeanFactory,BeanDefinitionRegistry {
	private final Map<String, BeanDefinition> beanDefinationMap = new ConcurrentHashMap<>();
	private ClassLoader beanClassLoader;

	public DefaultBeanFactory() {
	}

	@Override
	public BeanDefinition getBeanDefinition(String beanId) {
		return this.beanDefinationMap.get(beanId);
	}

	@Override
	public void registerBeanDefinition(String beanId, BeanDefinition bd) {
		this.beanDefinationMap.put(beanId, bd);
	}

	@Override
	public Object getBean(String beanId) {
		BeanDefinition bd = this.getBeanDefinition(beanId);
		if (bd == null) {
			throw new BeanCreationException("Bean definition dose not exist");
		}
		// 判断,如果是单例,直接get 如果不是,则创建,并注册到map
		if (bd.isSingleton()) {
			Object bean = this.getSingleton(beanId);
			if (bean == null) {
				bean = createBean(bd);
				this.registerSingleton(beanId, bean);
			}
			return bean;
		}
		return createBean(bd);
	}

	private Object createBean(BeanDefinition bd) {
		ClassLoader cl = this.getBeanClassLoader();
		String beanClassName = bd.getBeanClassName();
		Class<?> clz = null;
		try {
			clz = cl.loadClass(beanClassName);
			return clz.newInstance();
		} catch (Exception e) {
			throw new BeanCreationException("create bean for "+beanClassName+"faild");
		}
	}

	@Override
	public void setBeanClassLoader(ClassLoader beanClassLoader) {
		this.beanClassLoader = beanClassLoader;
	}

	@Override
	public ClassLoader getBeanClassLoader() {
		return (this.beanClassLoader != null ? this.beanClassLoader : ClassUtils.getDefaultClassLoader());
	}
}
