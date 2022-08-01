package StringExample;

public class ObjectCreation {
	public static void main(String[] args) {

		String s = new String("Software");
		String s1 = new String("Software");
		String s2 = "Software";
		String s3 = s;
		String s4 = "Software";
		
		// ==  >> when 2 references  pointing to ssme object
		// equals() // data chcek
		// hashCode()
		
//		System.out.println(s == s1);  // false
//		System.out.println(s.equals(s1)); // true
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(s.hashCode() == s1.hashCode());
		
		
//		System.out.println(s1 == s2);  // false
//		System.out.println(s1.equals(s2)); // true
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
//		System.out.println(s1.hashCode() == s2.hashCode());
		
//		System.out.println(s2 == s3);  // false
//		
//		System.out.println(s2.equals(s3)); // true
//		
//		System.out.println(s2.hashCode()); // this
//		System.out.println(s3.hashCode());  // this
//		
//		// true
//		System.out.println(s2.hashCode() == s3.hashCode());
//		
	
         System.out.println(s2 == s4);  // true
		
		System.out.println(s2.equals(s4)); // true 100%
		
		System.out.println(s2.hashCode()); // this
		System.out.println(s4.hashCode());  // this
		
		// true
		System.out.println(s2.hashCode() == s4.hashCode());
		
		
	}
}
