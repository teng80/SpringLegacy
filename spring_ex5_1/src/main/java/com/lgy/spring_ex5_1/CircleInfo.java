package com.lgy.spring_ex5_1;

public class CircleInfo {

	private Circle circle;
	
	public CircleInfo(Circle circle) {
		this.circle = circle;
	}
	
//	생성자 호출student.getName()
	public void getCircleInfo() {
		
		if (circle != null) {
			System.out.println("반지름 : " + circle.getRadius());
			System.out.println("원의 면적은 : " + circle.process());
			System.out.println("==========================");
		}		
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}