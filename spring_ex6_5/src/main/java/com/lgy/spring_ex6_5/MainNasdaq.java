package com.lgy.spring_ex6_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainNasdaq {
	public static void main(String[] args) {
		
		String configLoc1 = "classpath:nasdaqCTX.xml";
		String configLoc2 = "classpath:nasdaqCTX2.xml";
	    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1, configLoc2);

//	  	테슬라 객체정보 가져옴
	    Nasdaq nasdaq1 = ctx.getBean("nasdaq1",Nasdaq.class);
//	  	테슬라  
		System.out.println(nasdaq1.getStock());
		System.out.println(nasdaq1.getCapRank());
		System.out.println(nasdaq1.getProduct());
		System.out.println("=========================");
		
		NasdaqInfo nasdaqInfo = ctx.getBean("nasdaqInfo1",NasdaqInfo.class);
//	    nasdaq1 객체를 참조
		Nasdaq nasdaq2 = nasdaqInfo.getNasdaq();
//	    테슬라 
		System.out.println(nasdaq2.getStock());
		System.out.println(nasdaq2.getCapRank());
		System.out.println(nasdaq2.getProduct());
		System.out.println("=========================");
		
//	  	Nvidia 객체정보 가져옴
		Nasdaq nasdaq3 = ctx.getBean("nasdaq3",Nasdaq.class);
//	  	Nvidia  
		System.out.println(nasdaq3.getStock());
		System.out.println(nasdaq3.getCapRank());
		System.out.println(nasdaq3.getProduct());
	}
}