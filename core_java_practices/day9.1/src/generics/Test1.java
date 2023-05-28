package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static utils.GenericUtils.*;

public class Test1 {

	public static void main(String[] args) {
		// Use Arrays class's asList method : to ret fixed size list of strings
		//public static <T> List<T> asList(T... elems)
		List<String> strings=Arrays.asList("one","two","three");
	//	strings.add("four");
		strings.set(0, strings.get(0).toUpperCase());
		printElementsFromCollection2 (strings);
//		System.out.println(strings);
		ArrayList<?> list=new ArrayList<>();//place the cursor on RHS to check the inferred type !
		//can u shuffle list of strings ?
		Collections.shuffle(strings);
		System.out.println("shuffled list "+strings);
	
	}
}
