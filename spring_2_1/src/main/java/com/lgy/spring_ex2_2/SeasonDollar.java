package com.lgy.spring_ex2_2;

public class SeasonDollar {
	public static void main(String[] args) {
//		의존 + 주입(DI(Dependency Injection) : DI		
		Season season = new Season();
		season.setMonth(9);
		season.season();
		
//		의존 + 주입(DI(Dependency Injection) : DI
		Won2dollar dollar = new Won2dollar();
		dollar.setWon(3300);
		dollar.exchange();
	}
}