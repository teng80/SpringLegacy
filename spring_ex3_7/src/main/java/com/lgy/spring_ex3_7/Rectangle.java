package com.lgy.spring_ex3_7;

public class Rectangle {
	
	public void process(int x, int y) {
//		(100,100),(200,200) 좌표범위 
			if((x>=100 && x<=200) && (y>=100 && y<=200)){
				System.out.println("("+x+", "+y+")"+"는 사각형 안에 있습니다.");
				
			} else {
				System.out.println("("+x+", "+y+")"+"는 사각형 안에 없습니다.");
			} 	
		}
}