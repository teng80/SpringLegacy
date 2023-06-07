package com.lgy.spring_ex6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEmployee {
	public static void main(String[] args) {
		String configLoc1 = "classpath:employeeCTX.xml";
		String configLoc2 = "classpath:employeeCTX2.xml";
	    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1, configLoc2);

//	  	임영웅 객체정보 가져옴
	    Employee employee1 = ctx.getBean("employee1",Employee.class);
//	  	임영웅
		System.out.println(employee1.getName());
		System.out.println(employee1.getPay());
		System.out.println(employee1.getLicense());
		System.out.println("=========================");
	      
		EmplyeeInfo emplyeeInfo =  ctx.getBean("emplyeeInfo1",EmplyeeInfo.class);
//	    employee1 객체를 참조
		Employee employee2 = emplyeeInfo.getEmployee();
//	    임영웅
		System.out.println(employee2.getName());
		System.out.println(employee2.getPay());
		System.out.println(employee2.getLicense());
		System.out.println("=========================");
	    
//	    이찬원 객체정보 가져옴
		Employee employee3 = ctx.getBean("employee3",Employee.class);
//	    이찬원
		System.out.println(employee3.getName());
		System.out.println(employee3.getPay());
		System.out.println(employee3.getLicense());
	}
}