package com.lgy.spring_7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
//		<context:annotation-config></context:annotation-config> 추가하면
//		@PostConstruct, @PreDestroy 2개가 동작됨
//		@# initMethod()
//		@# destroyMethod()
		
//		@# afterPropertiesSet() : 1. 빈 생성시 호출
//		INFO : org.springframework.context.support.GenericXmlApplicationContext - Closing org.springframework.context.support.GenericXmlApplicationContext@2957fcb0: startup date [Mon May 22 14:53:48 KST 2023]; root of context hierarchy
//		INFO : org.springframework.beans.factory.support.DefaultListableBeanFactory - Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@2d3fcdbd: defining beans [student,otherStudent]; root of factory hierarchy
//		@# destroy() : 4. 소멸후 호출
		ctx.refresh(); //refresh 어노테이션 호출할때 필요
		
		ctx.close();
	}
}