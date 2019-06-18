package com.sw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] names = ac.getBeanDefinitionNames();
		for(String string:names) {
			System.out.println(string);
		}
	}
}
