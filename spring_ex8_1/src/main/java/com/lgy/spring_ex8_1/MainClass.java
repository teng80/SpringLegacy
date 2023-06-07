package com.lgy.spring_ex8_1;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
//		ConfigurableApplicationContext 인터페이스를 이용해서 Environment 객체 생성
		ConfigurableEnvironment env = ctx.getEnvironment();
//		getPropertySources() 를 이용해서 프로퍼티 소스 객체 생성
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
//			ResourcePropertySource 객체를 이용해서 외부파일 정보를 가져와서 프로퍼티 소스에 추가
			propertySources.addLast(new ResourcePropertySource("classpath:oracle.account"));
			
			System.out.println("@# id===>"+env.getProperty("emp.id"));
			System.out.println("@# pw===>"+env.getProperty("emp.pw"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		GenericXmlApplicationContext 클래스로 다운캐스팅
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx; 
//		INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [applicationCTX.xml]
		gCtx.load("applicationCTX.xml");
//		객체 생성전과 객체 생성시 해당되는 메소드 호출 => 프로퍼티 값들 저장
//		private Environment env;
//		private String empId;
//		private String empPw;
//		@# setEnvironment
//		@# afterPropertiesSet
		gCtx.refresh();
		
		EmpConnection empConnection = gCtx.getBean("empConnection", EmpConnection.class);
//		emp ID : scott
//		emp PW : tiger
		System.out.println("emp ID : "+empConnection.getEmpId());
		System.out.println("emp PW : "+empConnection.getEmpPw());
	}
}
