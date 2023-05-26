package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);//auto boxing 
//		//attach iterator to display elems
//		Iterator<Integer> itr=list.iterator();//itr : before 1st elem , before index 0
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		itr.next();
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(50);
	
//	for(Integer i : arr)
//	{
//		System.out.println(i);
//	}
	
	Iterator<Integer> itr=arr.iterator();
	System.out.println("displaying the data using iterator :: ");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
//	itr.next(); error:NoSuchElement exception
	}

}
