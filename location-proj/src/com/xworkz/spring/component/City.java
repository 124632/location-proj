package com.xworkz.spring.component;

public class City {
	private String name;
	private State state;
	private int diameter;
	
	public City() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public void setName(String name) {
		System.out.println("invoke setName"+name);
		this.name = name;
	}

	public void setState(State state) {
		System.out.println("invoke setState"+state);
		this.state = state;
	}

	public void setDiameter(int diameter) {
		System.out.println("invoke setDiameter"+diameter);
		this.diameter = diameter;
	}

}
