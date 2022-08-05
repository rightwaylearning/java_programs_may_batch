package String_SBuilder_SBufferExample;

public class test {
	
	public static void main(String[] args) {
		String s = new String("abc");
		s.concat("lmn");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer();
		sb.append("lmn");
		System.out.println(sb);
		
		StringBuilder b = new StringBuilder();
		b.append("lmn");
		System.out.println(b);
		
		
		
	}
	

}
