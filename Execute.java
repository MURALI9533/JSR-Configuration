package com.jsrconfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	public static void main(String args[]) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a=(A) ctx.getBean("objA");
		B b=a.getB();
		b.m1();
		System.out.println("value of b is     "+"  "+b);
		ctx.close();
	}

}
