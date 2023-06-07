package com.lgy.spring_8_2_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("adminID : "+connection.getAdminId());
		System.out.println("adminPW : "+connection.getAdminPw());
		System.out.println("sub_adminID : "+connection.getSub_adminId());
		System.out.println("sub_adminID : "+connection.getSub_adminPw());		
	}
}