package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.Institute;

public class Tester {
	public static void main(String[] args) {
		String xmlFile="resource/Spring.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(xmlFile);
		
		Institute institute=container.getBean(Institute.class);
		institute.displayDetails();
	}

}
