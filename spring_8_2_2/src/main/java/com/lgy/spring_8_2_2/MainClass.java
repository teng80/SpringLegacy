package com.lgy.spring_8_2_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		스프링 xml 설정파일 주석처리		
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");
//		스프링 자바 설정파일로 사용
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		
//		adminID : abcde
//		adminPW : 12345
//		sub_adminID : fghij
//		sub_adminID : 67890
		
		System.out.println("adminID : "+connection.getAdminId());
		System.out.println("adminPW : "+connection.getAdminPw());
		System.out.println("sub_adminID : "+connection.getSub_adminId());
		System.out.println("sub_adminID : "+connection.getSub_adminPw());		
	}
}