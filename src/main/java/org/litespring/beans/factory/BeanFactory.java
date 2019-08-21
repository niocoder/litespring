package org.litespring.beans.factory;

import org.litespring.beans.BeanDefinition;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 10:24 2019/8/21
 * @Modified By:
 * @Version:
 */
public interface BeanFactory {

	Object getBean(String beanId);
}
