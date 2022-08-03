package string_stringbuffer_stringbuider;

public class ImmutabilityDemo {

	public static void main(String[] args) {
		String s =new String("abc");
		s.concat("lmn"); 
		System.out.println(s);
		
		StringBuffer b = new StringBuffer("abc");
		b.append("lmn");
		System.out.println(b);  // abclmn
		
		StringBuilder sb = new StringBuilder("abc");
		sb.append("lmn");
		System.out.println(sb);
		
		
		
	}
}
