package org.litespring.beans;

import java.util.List;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 10:28 2019/8/21
 * @Modified By:
 * @Version:
 */
public interface BeanDefinition {
	public static final String SCOPE_DEFAULT = "";
	public static final String SCOPE_SINGLETON = "singleton";
	public static final String SCOPE_PROTOTYPE = "prototype";
	public boolean isSingleton();
	public boolean isPrototype();
	String getScope();
	void setScope(String scope);

	String getBeanClassName();

	List<PropertyValue> getPropertyValues();

	ConstructorArgument getConstructorArgument();

	String getID();
}
