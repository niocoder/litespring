package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 14:04 2019/8/21
 * @Modified By:
 * @Version:
 */
public interface BeanDefinitionRegistry {
	BeanDefinition getBeanDefinition(String beanId);
	void registerBeanDefinition(String beanId, BeanDefinition bd);
}
