package com.app.tester;
import java.util.*;
import com.app.*;

public class fruitbasket {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of basket :: ");
		Fruit [] basket=new Fruit[sc.nextInt()];
		int index=0;
		int ch;
		do {
		System.out.println("1.add Mango. \n 2.add orange. \n 3.add apple. \n 4.display names of fruits.\n 5.Display details of fruit \n 6.make fruit stale. \n 7. Mark all sour fruits stale \n 8.Specific functions \n 9.exit");
		System.out.println("enter choice :");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter name colour and weight of mango :: ");
			if(index<basket.length)
			{
				
				basket[index++]=new Mango(sc.next(),sc.next(),sc.nextDouble());
				
			}
			else
			{
				System.out.println("Array is full!!");
			}
			
			break;
			
		case 2:
			System.out.println("enter name colour and weight of orange :: ");
			if(index<basket.length)
			{
				
				basket[index++]=new Orange(sc.next(),sc.next(),sc.nextDouble());
				
			}
			else
			{
				System.out.println("Array is full!!");
			}
			
			break;
		case 3:
			System.out.println("enter name colour and weight of apple :: ");
			if(index<basket.length)
			{
				basket[index++]=new Mango(sc.next(),sc.next(),sc.nextDouble());
			
			}
			else
			{
				System.out.println("Array is full!!");
			}
			break;
			
		case 4:
			for(Fruit f:basket)
			{
				if(f!=null)
				{
					System.out.println(f.getName());
				}
			}
			break;
		case 5:
			for(Fruit f:basket)
			{
				if(f!=null)
				{
					System.out.println(f+" taste="+f.taste());
			
				}
			}
			break;
		case 6:
			System.out.println("which fruit do you want to make stale :: ");
			System.out.println("enter index :: ");
			int i=sc.nextInt();
			for(Fruit f : basket)
			{
				if(f!=null)
				{
				if(f==basket[i])
				{
					f.setFresh(false);
				}
				}
			}
			
			break;
			
		case 7:
			for(Fruit f:basket)
			{
				if(f!=null)
				{
					if(f.taste().equals("sour"))
					{
						f.setFresh(false);
					}
				}
			}
			break;
			
		case 8:
			for(Fruit f:basket)
			{
				if(f!=null)
				{
					if(f instanceof Mango)
					{
						((Mango)f).pulp();
					}
					else if(f instanceof Orange)
					{
						((Orange)f).juice();
					}
					else if(f instanceof Apple)
					{
						((Apple)f).jam();
					}
				}
			}
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}//case 	
			
		}while(ch!=9); //ending while 
		
		
		}//main

}//class
