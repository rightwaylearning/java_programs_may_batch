package string_class_methods;

public class StringLength {
	
	// length (its array part) vs length() (its string part)

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		System.out.println(arr.length);
		// this is array object propetry
		
		String s1 = "abcde";
		System.out.println(s1.length());// method
		
	}
}
