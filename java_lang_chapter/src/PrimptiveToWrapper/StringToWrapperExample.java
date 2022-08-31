package PrimptiveToWrapper;

public class StringToWrapperExample {
	public static void main(String[] args) {
		
		/// String to Wrapper
		String s = "10";
		Integer.valueOf(s);
		System.out.println(s);
		
		
		String s1 = "90";
		Byte.valueOf(s1);
		System.out.println(s1);
		
		
		String s2 ="1000";
		Long.valueOf(s2);
		System.out.println(s2);
		
		String s3 = "754";
		Double.valueOf(s3);
		System.out.println(s3);
		
		
		///// Wrapper To String
		System.out.println("===============================");
		Integer i =10;
		Integer.toString(i);
		System.out.println(i);
		
		Byte b =65;
		Byte.toString(b);
		System.out.println(b);
		
		Double d = 87d;
		Double.toString(d);
		System.out.println(d);
		
		Boolean b1 = true;
		Boolean.toString(b1);
		System.out.println(b1);
		
		


}
}