package StringBufferMethodCreation;

public class test {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb.length());
		
		StringBuffer sb1 = new StringBuffer("tybcs");
		System.out.println(sb1.capacity());
		
		sb1.append(sb);
		System.out.println(sb1);
	}

}
