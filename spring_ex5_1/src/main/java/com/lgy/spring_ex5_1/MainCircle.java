package com.lgy.spring_ex5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCircle {
	public static void main(String[] args) {
//		circleCTX.xml 파일로 객체 정보를 가짐
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:circleCTX.xml");
//		xml 을 파싱한 객체에서 getBean 메소드로 xml에서 생성된 bean 객체정보를 가져옴
		CircleInfo circleInfo = ctx.getBean("circleInfo", CircleInfo.class);
//		circleInfo 레퍼런스변수로 CircleInfo.class 의 circleInfo 객체를 가져와서 getCircleInfo 메소드 호출
		circleInfo.getCircleInfo();
		
//		circle2 레퍼런스변수로 Circle.class 의 circle2 객체를 가져옴
		Circle circle2 = ctx.getBean("circle2", Circle.class);
//		circleInfo 레퍼런스변수로 매개변수를 circle2 로 setCircle 메소드 호출
		circleInfo.setCircle(circle2);
//		circleInfo 레퍼런스변수로 getCircleInfo 메소드 호출
		circleInfo.getCircleInfo();
		
		ctx.close();
	}
}