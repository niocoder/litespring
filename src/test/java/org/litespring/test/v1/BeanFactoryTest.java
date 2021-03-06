package org.litespring.test.v1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.litespring.beans.BeanDefinition;
import org.litespring.beans.factory.BeanCreationException;
import org.litespring.beans.factory.BeanDefinitionStoreException;
import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.litespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.litespring.core.io.ClassPathResource;
import org.litespring.service.v1.PetStoreService;

/**
 * @Author: zhenglc
 * @Descriptions:
 * @Data: Created in 10:09 2019/8/21
 * @Modified By:
 * @Version:
 */
public class BeanFactoryTest {
	DefaultBeanFactory factory = null;
	XmlBeanDefinitionReader reader = null;
	@Before
	public void setUp() {
		factory = new DefaultBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
	}
	@Test
	public void testGetBean() {
		reader.loadBeanDefinition(new ClassPathResource("petstore-v1.xml"));
		BeanDefinition bd = factory.getBeanDefinition("petStore");
		Assert.assertEquals("org.litespring.service.v1.PetStoreService",bd.getBeanClassName());

		PetStoreService petStoreService = (PetStoreService)factory.getBean("petStore");
		Assert.assertNotNull(petStoreService);
	}

	@Test
	public void testInvalidBean() {
		reader.loadBeanDefinition(new ClassPathResource("petstore-v1.xml"));
		try {
			factory.getBean("invalidBean");
		} catch (BeanCreationException e) {
			return;
		}
		Assert.fail("Except BeanCreationException");
	}

	@Test
	public void testInvalidXML() {
		try {
			reader.loadBeanDefinition(new ClassPathResource("xxx.xml"));
		} catch (BeanDefinitionStoreException e) {
			return;
		}
		Assert.fail("except BeanDefinitionStoreException");
	}
}
