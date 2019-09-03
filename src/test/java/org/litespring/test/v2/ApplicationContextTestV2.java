package org.litespring.test.v2;

import org.junit.Assert;
import org.junit.Test;
import org.litespring.context.ApplicationContext;
import org.litespring.context.support.ClassPathXmlApplicationContext;
import org.litespring.dao.v2.AccountDao;
import org.litespring.dao.v2.ItemDao;
import org.litespring.service.v2.PetStoreService;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 14:44 2019/8/26
 * @Modified By:
 * @Version:
 */
public class ApplicationContextTestV2 {

	@Test
	public void testGetBeanProperty() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("petstore-v2.xml");
		PetStoreService petStore = (PetStoreService) ctx.getBean("petStore");
		Assert.assertNotNull(petStore.getAccountDao());
		Assert.assertNotNull(petStore.getItemDao());

		Assert.assertTrue(petStore.getAccountDao() instanceof AccountDao);
		Assert.assertTrue(petStore.getItemDao() instanceof ItemDao);

		Assert.assertEquals("zlc",petStore.getOwner());
		Assert.assertEquals(2,petStore.getVersion());

	}
}
