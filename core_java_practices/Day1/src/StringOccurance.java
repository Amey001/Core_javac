import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int thirdindex=0;
		int index=0,secondindex=0;
		//System.out.println("Enter the string");
		String str="Hi Everyone How Are You";
		
		System.out.println("enter the charecter");
		char c=sc.next().charAt(0);
		
		
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)==c)
		{
		count++;

		//thirdindex=secondindex;
		secondindex=index;
		index=i;
		}

		}

		// System.out.println("Index is :"+thirdindex);
		if(count==0)
		{
		System.out.println("Character not present");
		}
		else if(count ==1)
		{
		System.out.println("No 2 Occureneces");

		}
		else
		{
		System.out.println("Index is :"+secondindex);
		}

		// for(int i=str.length()-1;i>=0;i--)
		// {
		//
		// }

	}

}
