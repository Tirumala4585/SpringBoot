package com.tmf.bank.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeDrawer {
	public static void main(String []args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t1 = (Triangle)context.getBean("triangle");
		t1.draw();
	}


}

