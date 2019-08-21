package org.litespring.test.v1;

import org.junit.Assert;
import org.junit.Test;
import org.litespring.context.ApplicationContext;
import org.litespring.context.support.ClassPathXmlApplicationContext;
import org.litespring.context.support.FileSystemXmlApplicationContext;
import org.litespring.service.v1.PetStoreService;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 14:56 2019/8/21
 * @Modified By:
 * @Version:
 */
public class ApplicationContextTest {
	@Test
	public void testGetBean() {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("petstore-v1.xml");
		PetStoreService petStore = (PetStoreService) cxt.getBean("petStore");
		Assert.assertNotNull(petStore);
	}

	@Test
	public void testGetFileFromFileSystemContext() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\eclipse-workspace\\litespring\\src\\test\\resources\\petstore-v1.xml");
		PetStoreService petStore = (PetStoreService) ctx.getBean("petStore");
		Assert.assertNotNull(petStore);
	}
}
