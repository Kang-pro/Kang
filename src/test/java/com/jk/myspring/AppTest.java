package com.jk.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jk.myspring.entity.Print;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

public class AppTest extends TestCase{
	
	public void testIoc() {
		
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		Print p = (Print) application.getBean("print");
		p.print();
		
	}
}

