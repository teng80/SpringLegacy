package com.lgy.spring_2_1;

public class MainClass {
	public static void main(String[] args) {
//		Calcuation 클래스가 MainClass 클래스에 의존
//		Calcuation 클래스로 객체 생성해서 값을 주입
//		의존 + 주입(DI(Dependency Injection) : DI
		Calcuation calcuation = new Calcuation();
		calcuation.setFirstNum(10); 
		calcuation.setSecondNum(2); 
		
		calcuation.add();
		calcuation.sub();
		calcuation.mul();
		calcuation.div();
	}
}
