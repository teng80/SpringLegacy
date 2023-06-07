package com.lgy.spring_ex10_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Car car = ctx.getBean("car", Car.class);
//		카정보 출력(핵심기능 - 메소드)
		car.getCarInfo();
		
		Graphic graphic = ctx.getBean("graphic", Graphic.class);
//		그래픽정보 출력(핵심기능 - 메소드)
		graphic.getGraphicInfo();
	}
}