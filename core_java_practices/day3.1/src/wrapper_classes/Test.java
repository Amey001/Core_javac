package wrapper_classes;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(1234);// new Integer(1234); boxing
		int data = i1.intValue();// un boxing(wrapper --> primitive)
		i1 = 12345;// auto boxing(prim:int --> wrapper:Integer) --done auto by javac
		int data2 = i1;// auto un boxing
		String s = "1234567890";		//literal string 
		// s++; Javac DOES NOT allow arithmetic operators with ref type of vars.
		i1++;// auto un boxing(Integer--->int),increment,auto boxing
		System.out.println(i1);// Integer's toString : 12346
		Double d1 = 123.456;// auto boxing double ---> Double
		double val = d1++;// auto unboxing--assign--inc ----auto boxing
		System.out.println(val);	//123.456
		System.out.println(d1);		//124.456
		double d2 = 12.34f;// widening
		// Double d3=12.34f;//float --> auto boxing ---> Float ---X--- Double
		Double d3 = (double) 12.34f; // float --> widening : prog -->double ---auto boxing --Double
		// d3=12.340000;
		System.out.println("d3 :: "+d3);
		Number n = 123.456F;// float --> auto boxing --> Float --> up casting --> Number
		System.out.println(n.getClass());//java.lang.Float
		n=345;
		System.out.println(n.getClass());//java.lang.Integer
		n=34.5678;
		System.out.println(n.getClass());//java.lang.Double
	//	n=true;//javac err
//		n="asdf"; cannot convert string to number 
		Object o=true;//boolean--> auto box --> Boolean -->up casting --> Object
		System.out.println(o.getClass());
		o=100;
		System.out.println(o.getClass());
		o=456.78f;
		System.out.println(o.getClass());//Float
		o="fhsfghgf";//up casting
		System.out.println(o.getClass());
		o=LocalDate.now();//up casting
		System.out.println(o);
		/*
		 * Is Java pure OOP ? NO
		 * Can Object type of ref , refer to ANY data type(prim / ref) in Java : YES
		 */
	}

}
