package com.app;

public class Apple extends Fruit{

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
		
	}

	@Override
	public String toString() {
		return "Name=" + getName() + " Color=" + getColor() + " Weight=" + getWeight()+" fresh="+this.getFresh();
	}
	
	@Override
	public String taste()	{
		return "Sweet and sour";
	}
	
	public void jam()
	{
		System.out.println(" name :: "+this.getName()+ " making jam " );
	}
	
	
	

}
