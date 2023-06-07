package com.lgy.spring_ex3_1;

public class MyCircle {
	
	private Circle clrcle;
	private int radius;
	
	public void	ar() {
		clrcle.area(radius);
	}
	
	public Circle getClrcle() {
		return clrcle;
	}
	public void setClrcle(Circle clrcle) {
		this.clrcle = clrcle;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
