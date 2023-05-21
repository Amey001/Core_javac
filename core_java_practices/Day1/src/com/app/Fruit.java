package com.app;

public class Fruit {

	private String name,color;
	private double weight;
	private boolean fresh;
	
	public Fruit(String name,String color,double weight)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.fresh=true;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	public void setFresh(boolean tf)
	{
		this.fresh=tf;
	}
	public boolean getFresh()
	{
		return this.fresh;
	}
	public String taste()
	{
		return "No specific taste";
	}
	
	@Override
	public String toString()
	{
		return "Name:"+this.name+" Color:"+this.color+" Weight:"+this.weight;
	}
	
	
}
