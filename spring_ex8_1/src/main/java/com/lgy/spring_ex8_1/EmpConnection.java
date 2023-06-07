package com.lgy.spring_ex8_1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EmpConnection implements InitializingBean, EnvironmentAware {
//	Environment : 환경객체로 시스템 설정 값들 저장
	private Environment env; //객체 생성 전에 environment 객체를 받아서 저장
	private String empId;
	private String empPw;
	
//	setEnvironment : 객체 생성전 호출 (1번)
	@Override
	public void setEnvironment(Environment environment) {		
//		System.out.println("@# setEnvironment");
//		환경객체를 env 객체에 저장
		setEnv(environment);
	}
	
//	객체 생성시 호출 (2번)
	@Override
	public void afterPropertiesSet() throws Exception {
//		System.out.println("@# afterPropertiesSet");
//		프로퍼티 소스에 있는 정보 => emp.id, emp.pw
//		프로퍼티 소스에서 어드민 아이디를 가져와서 EmpId 에 저장
		setEmpId(env.getProperty("emp.id"));
//		프로퍼티 소스에서 어드민 비밀번호를 가져와서 EmpPw 에 저장
		setEmpPw(env.getProperty("emp.pw"));
	}
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}	
}
