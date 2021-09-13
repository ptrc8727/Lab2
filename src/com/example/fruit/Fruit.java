package com.example.fruit;

import java.util.Comparator;

public class Fruit {
	
	private String name;
	
	public Fruit(String name) {
		
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class FruitCom implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		return o1.getName().compareTo(o2.getName());
		
	}
	
	
	
}