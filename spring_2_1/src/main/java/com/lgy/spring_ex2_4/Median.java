package com.lgy.spring_ex2_4;

public class Median {
	
	private int a;
	private int b;
	private int c;
	private int median;
	
	public void process() {
		if ((a>b && a<c) || (a>c && a<b)){
			median=a;
		}else if ((b>a && b<c) || (b>c && b<a)) {
			median=b;
		}else {
			median=c;
		}   
		System.out.println("입력된 정수가 "+a+"와 "+b+"와 "+c+"의 "+"중간 값은 "+ median);	
	}
		
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}	
}