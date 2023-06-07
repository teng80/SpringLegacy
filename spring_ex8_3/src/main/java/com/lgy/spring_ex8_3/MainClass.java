package com.lgy.spring_ex8_3;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config="";
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		if (str.equals("oracle")) { //oracle서버일때
			config="oracle";
		}else if (str.equals("mysql")) { //mysql서버일때
			config="mysql";
		}
		scanner.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); //oracle or mysql
		//oracle or mysql 값을 가지고 profile 속성을 찾아감(xml 하나 선택됨)
		ctx.load("oracleCTX.xml", "mysqlCTX.xml");
		DbInfo info = ctx.getBean("dbInfo", DbInfo.class);
		System.out.println("driver : " + info.getDriver());
		System.out.println("url : " + info.getUrl());
		System.out.println("user : " + info.getUser());
		System.out.println("pwd : " + info.getPassword());
	}
}
