package com.app;

public class Orange extends Fruit{

	public Orange(String name, String color, double weight) {
		super(name, color, weight);
	}

	@Override
	public String toString() {
		return "name =" + getName() + " Color= "+ getColor() + " Weight=" + getWeight()+" fresh="+this.getFresh();
	}
	@Override
	public String taste()
	{
		return "sour";
	}
	public void juice()
	{
		System.out.println(" name :: "+this.getName()+" weight :: "+this.getWeight()+" extracting juice .");
	}
	
	
	
	
	
}
