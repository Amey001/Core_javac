package com.app;

public class Mango extends Fruit{

	public Mango(String name,String color,double weight)
	{
		super(name,color,weight);
	}

	@Override
	public String taste()
	{
		return "sweet";
	}
	
	public void pulp()
	{
		System.out.println("Name:"+this.getName()+" Color: "+this.getColor()+" creating pulp");
	}
	
	@Override
	public String toString() {
		return "Name=" + getName() + " Color=" + getColor() + " Weight=" + getWeight()+" fresh="+this.getFresh();
	}
	
	
}
