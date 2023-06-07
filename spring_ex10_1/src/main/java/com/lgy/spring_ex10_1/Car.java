package com.lgy.spring_ex10_1;

public class Car {
	private String company;
	private int capRank;
	private String product;
	
	public void getCarInfo() {
		System.out.println("회사 : "+getCompany());
		System.out.println("시총 : "+getCapRank());
		System.out.println("제품 : "+getProduct());
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCapRank() {
		return capRank;
	}
	public void setCapRank(int capRank) {
		this.capRank = capRank;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}	
}