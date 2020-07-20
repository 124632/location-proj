package com.xworkz.spring.component;

import java.util.ArrayList;

public class Institute {
	private  ArrayList<String> trainers;
	private String name;
	private Location location;
	
	public Institute() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public void setTrainers(ArrayList<String> trainers) {
		System.out.println("invoke setTrainers"+trainers);
		this.trainers = trainers;
	}

	public void setName(String name) {
		System.out.println("invoke setName"+name);
		this.name = name;
	}
	
	public void setLocation(Location location) {
		System.out.println("invoke setLocation"+location);
		this.location = location;
	}

	public void displayDetails() {
		System.out.println("\nList of Trainers:"+this.trainers);
		  
	}
}
