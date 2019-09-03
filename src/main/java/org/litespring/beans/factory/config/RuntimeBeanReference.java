package org.litespring.beans.factory.config;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 15:07 2019/8/27
 * @Modified By:
 * @Version:
 */
public class RuntimeBeanReference {
	private final String beanName;

	public String getBeanName() {
		return beanName;
	}

	public RuntimeBeanReference(String beanName) {
		this.beanName = beanName;
	}
}
