package com.capgemini.spring.organization.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class OrganizationMain{
	
	public static void main(String[] args){
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("context.xml");
		context.refresh();
		Organization organization = context.getBean(Organization.class);
		System.out.println(organization);

	}


}