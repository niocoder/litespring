package org.litespring.beans.factory.config;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 14:58 2019/8/22
 * @Modified By:
 * @Version:
 */
public interface SingletonBeanRegistry {

	void registerSingleton(String beanName, Object singletonObject);

	Object getSingleton(String beanName);
}
