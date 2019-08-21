package org.litespring.context.support;

import org.litespring.core.io.ClassPathResource;
import org.litespring.core.io.Resource;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 15:12 2019/8/21
 * @Modified By:
 * @Version:
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {


	public ClassPathXmlApplicationContext(String configFile) {
		super(configFile);
	}

	@Override
	protected Resource getResourceByPath(String path) {
		return new ClassPathResource(path,this.getBeanClassLoader());
	}


}
