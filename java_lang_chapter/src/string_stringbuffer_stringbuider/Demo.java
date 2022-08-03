package string_stringbuffer_stringbuider;

public class Demo {
	public static void main(String[] args) {

		
		String s = new String("abc");
		String s1 = new String("abc");
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode() == s1.hashCode());
		
		
		
		StringBuffer b = new StringBuffer("abc");
		StringBuffer b1 = new StringBuffer("abc");
		
		System.out.println(b.equals(b1));
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
		
		System.out.println(b.hashCode() == b1.hashCode());
		
		System.out.println(b);
		
		
		
		
		
	}
}
