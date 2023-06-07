package com.lgy.spring_8_3_2;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config="";
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		if (str.equals("dev")) { //개발서버일때
			config="dev";
		}else if (str.equals("run")) { //운영서버일때
			config="run";
		}
		scanner.close();
//		xml 방식
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//		ctx.getEnvironment().setActiveProfiles(config); 
//		ctx.load("applicationCTX_dev.xml", "applicationCTX_run.xml");

//		java 방식
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
//		register 메소드 : class 등록
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();
		
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("ip : " + info.getIpNum());
		System.out.println("port : " + info.getPortNum());
	}
}

//ctrl+h
//File Search 탭
//내용 입력
//search 찾기
//ex>cglib 찾아서 복사해서 pom.xml에 붙여넣기
