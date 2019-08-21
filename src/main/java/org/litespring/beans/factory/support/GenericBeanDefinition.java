package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 10:38 2019/8/21
 * @Modified By:
 * @Version:
 */
public class GenericBeanDefinition implements BeanDefinition {
	private String id;
	private String beanClassName;

	public GenericBeanDefinition(String id, String beanClassName) {
		this.id = id;
		this.beanClassName = beanClassName;
	}

	@Override
	public String getBeanClassName() {
		return this.beanClassName;
	}
}
