package StringBufferMethodCreation;

public class test {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb.length());

		StringBuffer sb1 = new StringBuffer("tybcs");
		System.out.println(sb1.capacity());

		sb1.append(sb);
		System.out.println(sb1);

		StringBuffer sb3 = new StringBuffer("sonali galande");
		System.out.println(sb3.reverse());

		String s = new String("computer science");
		StringBuffer sb5 = new StringBuffer(s);
		System.out.println(sb5.reverse());
		System.out.println(s.charAt(5));

		String s1 = new String("sonal");
		String s2 = "galande";
		s2.concat(s1);
		System.out.println(s2);
		
		StringBuffer st = new StringBuffer("  good morning   ");
		st.append(s1);
		System.out.println(st);
		

	}

}
