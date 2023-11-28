package com.app.fruits;

public class Orange extends Fruits{

	public Orange(String color,double weight,String name ,boolean fresh) {
		super(color,weight,name,fresh);
		
	}
	public String taste() {
		return "Taste:sour";
	}
	public void juice() {
		System.out.println(this.getName()+this.getWeight()+"extracting juice!");
		
	}
}
