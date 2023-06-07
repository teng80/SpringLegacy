package com.lgy.spring_ex2_3;

public class DivAndRemains {

	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void process() {
//		10의 자리 : 나누기 10을 해서 몫		
		int ten = number/10;
//		1의 자리 : 나누기 10을 해서 나머지
		int one = number%10;
		
		if (ten == one) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
			
		} else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
	}		
}
