package com.lgy.spring_ex2_5;

public class Multiple {

	private int number;
	
	public void process() {
		boolean multiple = false;
		
		if (number % 3 == 0) {
			System.out.println("3의 배수이다");
			multiple = true;
		}
		if (number % 5 == 0) {
			System.out.println("5의 배수이다");
			multiple = true;
		}
		if (number % 8 == 0) {
			System.out.println("8의 배수이다");
			multiple = true;
		}
		//3,5,8배수의 조건이 하나도 아닐때
		if (multiple == false) {
			System.out.println("어느 배수도 아니다");
		}
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}




