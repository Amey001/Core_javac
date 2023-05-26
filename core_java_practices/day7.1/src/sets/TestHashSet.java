package sets;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		//HashSet() : size 0
		HashSet<Integer> hs=new HashSet<>();
		int [] data= {10,20,30,40,50,20};
		
//		String[] names= {"Shubham","Riya","Meera","Rama","Amish","Aniket","Rupa","Riya"};
		//populate the HS with names
		for(int s : data)
			System.out.println("Added "+hs.add(s));
		//display set : toString , Iterator,for-each
		System.out.println("HS contents "+hs);
		System.out.println("HS contains "+hs.contains("Rama"));//true
		System.out.println("Removed "+hs.remove("Rama"));//true
		System.out.println("HS contains "+hs.contains("Rama"));//f
		System.out.println("HS contents again "+hs);
			

	}

}
