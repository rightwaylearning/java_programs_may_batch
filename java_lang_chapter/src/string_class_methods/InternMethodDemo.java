package string_class_methods;

public class InternMethodDemo {

	public static void main(String[] args) {
		
		// intern :- using this method we can point reference 
		// variable to SCP object
		String s = new String("abc");
		String s1 = "abc";
		
		System.out.println(s ==s1);
		s = s.intern();
		System.out.println(s ==s1);
		
		// ------------------------------------
		// if object is not present on scp then intern() method will
		// create new object on scp
		String s2 = "abc";
		String s3 ="lmn";
		String s4 =  s2 + s3;
		s4 = s4.intern();
		String s5 = "abclmn";
		System.out.println(s4 == s5);
	    //--------------------------------------
		
		
		
		
		
		
		
	}
}
