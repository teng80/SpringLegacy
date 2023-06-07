package com.lgy.spring_ex3_8;

public class Median {
	
	public void process(int a, int b, int c) {
		
		if ((a>b && a<c) || (a>c && a<b)){
			System.out.println("입력된 정수가 "+a+"와 "+b+"와 "+c+"의 "+"중간 값은 "+ a);
		}else if ((b>a && b<c) || (b>c && b<a)) {
			System.out.println("입력된 정수가 "+a+"와 "+b+"와 "+c+"의 "+"중간 값은 "+ b);
		}else {
			System.out.println("입력된 정수가 "+a+"와 "+b+"와 "+c+"의 "+"중간 값은 "+ c);
		}   	
	}
}