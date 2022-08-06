package StringExample;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = new String("abc");
		s=s.intern();
		String s1 = "abc";
		
		System.out.println(s==s1); 
		System.out.println(s.length());
		System.out.println(s1.charAt(1));
		
		String s2 = "lmn";
		String s3 = s2.concat("pqr");
		System.out.println(s3);// lmnpqr
		
		String s4 ="abc";
		String s5 = "ABC";
		System.out.println(s4.equals(s5)); // false
		System.out.println(s4.equalsIgnoreCase(s5)); // true
		
	   System.out.println(s4.toUpperCase());
	   System.out.println(s5.toLowerCase());
	   
	   String s6 = "hello good morning india.";
	   System.out.println(s6.substring(6));
	   System.out.println(s6.substring(6, 10));
	   
	   String s7 ="india.";
	   System.out.println(s7.replace('i', 'I'));
	   
	   String s8 = "   abc    plq    ";
	   System.out.println(s8);
	   System.out.println(s8.trim());
	   
	   String s9 = "india";
	   System.out.println(s9.indexOf('i'));
	   System.out.println(s9.lastIndexOf('i'));
	   
		
	}
}
