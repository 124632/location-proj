package com.xworkz.spring.component;

public class State {
	private String name;
	private boolean unionTerriority;
	
	public State() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public void setName(String name) {
		System.out.println("invoke setName"+name);
		this.name = name;
	}

	public void setUnionTerriority(boolean unionTerriority) {
		System.out.println("invoke setUnionTerriority"+unionTerriority);
		this.unionTerriority = unionTerriority;
	}
}
