package com.xworkz.spring.component;

public class Location {
	private String street;
	private int doorNo;
	private City city;
	
	public Location() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public void setStreet(String street) {
		System.out.println("invoke setStreet"+street);
		this.street = street;
	}

	public void setDoorNo(int doorNo) {
		System.out.println("invoke setDoorNo"+doorNo);
		this.doorNo = doorNo;
	}

	public void setCity(City city) {
		System.out.println("invoke setCity"+city);
		this.city = city;
	}
	
}
