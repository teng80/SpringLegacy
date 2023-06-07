package com.lgy.spring_ex2_5;

public class Triangle {

	private int l1;
	private int l2;
	private int l3;
	
	public void process() {
		if ((l1+l2)>=l3 ||(l1+l3)>=l2||(l2+l3)>=l1) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 안됩니다.");
		}
	}
	
	public int getL1() {
		return l1;
	}
	public void setL1(int l1) {
		this.l1 = l1;
	}
	public int getL2() {
		return l2;
	}
	public void setL2(int l2) {
		this.l2 = l2;
	}
	public int getL3() {
		return l3;
	}
	public void setL3(int l3) {
		this.l3 = l3;
	}
	
}
