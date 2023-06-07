package com.lgy.spring_ex6_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainAnimation {
	public static void main(String[] args) {
		String configLoc1 = "classpath:animationCTX.xml";
		String configLoc2 = "classpath:animationCTX2.xml";
	    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1, configLoc2);

//	  	원피스 객체정보 가져옴
	    Animation animation1 = ctx.getBean("animation1",Animation.class);
//	  	원피스 
		System.out.println(animation1.getTitle());
		System.out.println(animation1.getYear());
		System.out.println(animation1.getCharacter());
		System.out.println("=========================");
		
		AnimationInfo animationInfo = ctx.getBean("animationInfo1",AnimationInfo.class);
//	    animation1 객체를 참조
		Animation animation2 = animationInfo.getAnimation();
//	    원피스 
		System.out.println(animation2.getTitle());
		System.out.println(animation2.getYear());
		System.out.println(animation2.getCharacter());
		System.out.println("=========================");
		
//	  	블리치 객체정보 가져옴
		Animation animation3 = ctx.getBean("animation3",Animation.class);
//	  	블리치 
		System.out.println(animation3.getTitle());
		System.out.println(animation3.getYear());
		System.out.println(animation3.getCharacter());
	}
}