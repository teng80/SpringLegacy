package com.lgy.spring_3_1;

public class Calculator {
	public void addtion(int f, int s) {
		System.out.println("addtion()");
		int result=f+s;
		System.out.println(f+"+"+s+"="+result);
	}
	public void subtraction(int f, int s) {
		System.out.println("subtraction()");
		int result=f-s;
		System.out.println(f+"-"+s+"="+result);
	}
	public void muiliplication(int f, int s) {
		System.out.println("muiliplication()");
		int result=f*s;
		System.out.println(f+"*"+s+"="+result);
	}
	public void division(int f, int s) {
		System.out.println("division()");
		int result=f/s;
		System.out.println(f+"/"+s+"="+result);
	}
}
