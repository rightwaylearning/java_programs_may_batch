package string_class_methods;

public class EqualsMethods {

	public static void main(String[] args) {
		String s = new String("abc");
		String s2 ="abc";
		System.out.println(s.equals(s2));
		
		String s3= "ABC";
		String s4 = "abc";
		System.out.println(s3.equalsIgnoreCase(s4));
	}
}
