package wrapper_classes;

public class wrapclasses {

	public static void main(String[] args) {
		Integer	i=Integer.valueOf(147852);	//boxing: primitive-->wrapper:: valueof is a static method so we call it by datatype
		int data=i.intValue();	//unboxing: converting from wraper to int(primitive)
		i=12345;	//autoboxing (primitive-->wrapper
		int a=i;	//autounboxing :wrapper -->primitive
	
		String s="kjhdsj";
		i++;
		Object o=s;
		Number n=643.645;
	}

}
