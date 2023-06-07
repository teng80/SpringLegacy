package com.lgy.spring_ex5_1;

public class Circle {
	
	private int radius;
	
//	생성자 추가
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double process() {
		return radius*radius*3.14;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}	
}
