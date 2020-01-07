package com.nagpurit.amol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Education {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		School sc=context.getBean("school", School.class);
		System.out.println(sc.sedu());
	}

}
