package com.lgy.spring_ex9_1;

public class Professor {
	private String name;
	private int age;
	private String subject;
	
	public void getProfessorInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("나이 : "+getAge());
		System.out.println("과목 : "+getSubject());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}	
}
