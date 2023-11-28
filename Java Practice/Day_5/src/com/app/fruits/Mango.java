package com.app.fruits;

public class Mango extends Fruits{

	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		return "Mango []"+"Taste:Sweet";
	}
    public void pulp() {
    	System.out.println(this.getColor()+this.getName()+"creating pulp");
	
}
	


}
