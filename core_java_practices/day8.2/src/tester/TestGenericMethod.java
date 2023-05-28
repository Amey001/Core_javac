package tester;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		// create a fixed size list of ints : 10,20,30,40,50
		List<Integer> intList=new ArrayList<>(Arrays.asList(10,20,30,40,50));//auto boxing
		System.out.println(intList);
		intList.add(60);
		//intlist.remove(0);
		intList.set(0,12345);
		System.out.println(intList.get(0));	
		System.out.println(intList);

	}

}
