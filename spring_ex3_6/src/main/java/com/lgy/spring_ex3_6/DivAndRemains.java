package com.lgy.spring_ex3_6;

public class DivAndRemains {
	
	public void process(int number) {
//		10의 자리 : 나누기 10을 해서 몫		
		int ten = number/10;
//		1의 자리 : 나누기 10을 해서 나머지
		int one = number%10;
		
		if (ten == one) {
			System.out.println("입력된 수 : "+number+"는 10의 자리와 1의 자리가 같습니다.");
			
		} else {
			System.out.println("입력된 수 : "+number+"는 10의 자리와 1의 자리가 다릅니다.");
		}
	}		
}