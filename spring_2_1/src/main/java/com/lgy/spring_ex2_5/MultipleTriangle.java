package com.lgy.spring_ex2_5;

public class MultipleTriangle {
	public static void main(String[] args) {
		
		Multiple multiple = new Multiple();
		multiple.setNumber(240);
		multiple.process();
		
		Triangle triangle = new Triangle();
		triangle.setL1(4);
		triangle.setL2(3);
		triangle.setL3(5);
		triangle.process();
	}
}