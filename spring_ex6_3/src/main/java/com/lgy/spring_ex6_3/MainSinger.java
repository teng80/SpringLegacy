package com.lgy.spring_ex6_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSinger {
	public static void main(String[] args) {
		String configLoc1 = "classpath:singerCTX.xml";
		String configLoc2 = "classpath:singerCTX2.xml";
	    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1, configLoc2);

//	  	방탄소년단 객체정보 가져옴
	    Singer singer1 = ctx.getBean("singer1",Singer.class);
//	  	방탄소년단
		System.out.println(singer1.getName());
		System.out.println(singer1.getMember());
		System.out.println(singer1.getSong());
		System.out.println("=========================");

		SingerInfo singerInfo = ctx.getBean("singerInfo1",SingerInfo.class);
//	    singer1 객체를 참조
		Singer singer2 = singerInfo.getSinger();
//	    방탄소년단
		System.out.println(singer2.getName());
		System.out.println(singer2.getMember());
		System.out.println(singer2.getSong());
		System.out.println("=========================");
		
//	    블랙핑크 객체정보 가져옴
		Singer singer3 = ctx.getBean("singer3",Singer.class);
//	    블랙핑크
		System.out.println(singer3.getName());
		System.out.println(singer3.getMember());
		System.out.println(singer3.getSong());
	}
}