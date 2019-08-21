package org.litespring.beans.factory.config;

import org.litespring.beans.factory.BeanFactory;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 18:52 2019/8/21
 * @Modified By:
 * @Version:
 */
public interface ConfigurableBeanFactory extends BeanFactory {
	void setBeanClassLoader(ClassLoader beanClassLoader);

	ClassLoader getBeanClassLoader();
}
