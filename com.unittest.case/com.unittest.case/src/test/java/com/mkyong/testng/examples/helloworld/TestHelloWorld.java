package com.mkyong.testng.examples.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mkyong.testng.project.service.email.RandomEmailGenerator;

import junit.framework.Assert;

public class TestHelloWorld {

	@Test()
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		/*String name = obj.getName();
		Assert.assertNotNull(name);*/
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");

	}
	
	
	@Test()
	public void nameTest() {

		RandomEmailGenerator obj = new RandomEmailGenerator();

		String name = obj.getName();
		Assert.assertNotNull(name);
		Assert.assertNotNull(name);
//		Assert.assertEquals(name, "Synechron");

	}
}
