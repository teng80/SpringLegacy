package com.lgy.spring_6_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext 클래스로 자바 스프링 설정파일 정보 가져옴
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		xml 스프링 설정으로 변경
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
//		홍길동 객체정보 가져옴
		Student student1 = ctx.getBean("student1", Student.class);
//		이름 : 홍길동
//		나이 : 20
//		취미 : [수영, 요리]
//		신장 : 180.0
//		몸무게 : 80.0
		System.out.println("이름 : "+student1.getName());
		System.out.println("나이 : "+student1.getAge());
		System.out.println("취미 : "+student1.getHobbys());
		System.out.println("신장 : "+student1.getHeight());
		System.out.println("몸무게 : "+student1.getWeight());
		
//		홍길순 객체정보 가져옴		
		Student student2 = ctx.getBean("student2", Student.class);
//		이름 : 홍길순
//		나이 : 30
//		취미 : [마라톤, 요리]
//		신장 : 190.0
//		몸무게 : 70.0
		System.out.println("이름 : "+student2.getName());
		System.out.println("나이 : "+student2.getAge());
		System.out.println("취미 : "+student2.getHobbys());
		System.out.println("신장 : "+student2.getHeight());
		System.out.println("몸무게 : "+student2.getWeight());
		
	}
}
