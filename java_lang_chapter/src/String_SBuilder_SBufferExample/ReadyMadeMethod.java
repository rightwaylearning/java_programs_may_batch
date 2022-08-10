package String_SBuilder_SBufferExample;

public class ReadyMadeMethod {

	public static void main(String[] args) {

		String s = new String("Hii good morning ");
		System.out.println(s.length());

		String s1 = new String("HI GOOD MORNING");
		System.out.println(s1.compareToIgnoreCase(s));

		String s2 = new String("Good Morning");
		System.out.println(s2.toUpperCase());

		String s3 = new String("HI GOOD MORNING");
		System.out.println(s3.lastIndexOf(s));

		String s4 = new String("HIIIIIIIIIIIIIIII GOOD MORNING");
		System.out.println(s4.toLowerCase());

		String s5 = new String("Sonali galande");
		System.out.println(s5.charAt(5));

		String s6 = new String("       Good night      ");
		System.out.println(s6);
		System.out.println(s6.trim());

		String s7 = new String("ABC");
		s = s7.concat("PQR");
		System.out.println(s);

		String A = new String("sonal");
		A.concat("galande");
		System.out.println(A);

		StringBuffer sb = new StringBuffer("Sonal");
		sb.append("Galande");
		System.out.println(sb);

		StringBuilder b = new StringBuilder("Tybcs");
		b.append("Tybsc computer science ");
		System.out.println(b);

		String aa = new String(b);
		System.out.println(aa);

		String a = new String("abc");
		String c = ("abc");
		a.equals(c);
		System.out.println(a.equals(c));
		System.out.println(a == c);
		System.out.println(a.hashCode());
		
		
		String r = new String("computer science");
		String r1 = new String("computer science");
		System.out.println(r.equals(c));
		System.out.println(r==r1);
		
		String pp = new String ("hii Good morning everyone");
		System.out.println(pp.substring(4));
		System.out.println(pp.substring(4, 16));
		
		
	}

}