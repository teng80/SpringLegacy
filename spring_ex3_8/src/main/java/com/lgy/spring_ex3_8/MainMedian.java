package com.lgy.spring_ex3_8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMedian {
	public static void main(String[] args) {
		String configLoc = "classpath:medianCTX.xml"; 
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		MyMedian myMedian = ctx.getBean("myMedian", MyMedian.class);
		
		myMedian.pc();
	}
}