package com.app.fruits;

public class Apple extends Fruits{

	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		
		return "Apple []"+"Taste:sweet n sour";
	
	}
	public void jam() {
		System.out.println(this.getName()+"Creating Jam!");
	}

	

}
