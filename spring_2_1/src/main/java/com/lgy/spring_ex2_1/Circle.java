package com.lgy.spring_ex2_1;

public class Circle {
	private int radius;
	
	public void circleArea() {
		System.out.println("원의 면적은 "+(radius*radius*3.14));
	}
		
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}	
}
