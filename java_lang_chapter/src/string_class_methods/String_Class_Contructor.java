package string_class_methods;

public class String_Class_Contructor {

	public static void main(String[] args) {
		
		String s = new String();
		System.out.println(s.length());
		
		String s1 = new String("abc");
		System.out.println(s1);
		System.out.println(s1.length());
		
		char[] arr = {'a','b','c','d'};
		String s2 = new String(arr);
		System.out.println(s2);
		
		byte[] arr1 = {65,66,67,68,69,70};
		String s3 = new String(arr1);
		System.out.println(s3);
		
		
		StringBuffer br = new StringBuffer("lmn");
		String s4 = new String(br);
		System.out.println(s4);
		
		
		StringBuilder buider = new StringBuilder("pqr");
		String s5 = new String(buider);
		System.out.println(s5);
		
	}
}
