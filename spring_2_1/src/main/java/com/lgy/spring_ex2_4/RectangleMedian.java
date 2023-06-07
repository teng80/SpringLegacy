package com.lgy.spring_ex2_4;

public class RectangleMedian {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(150);
		rectangle.setY(150);
		rectangle.process();
		
		Median median = new Median();
		median.setA(20);
		median.setB(100);
		median.setC(33);
		median.process();
	}
}