package ImmutableConstant;

public class test {

	public static void main(String[] args) {

		String s = new String("Hellooo");
		String s1 = new String("Hellooo");

		System.out.println(s == s1);

		String s2 = "GoodMorning";
		String s3 = new String("GoodMorning");

		System.out.println(s2 == s3);

		String s4 = new String("hii");
		String s5 = s4;

		System.out.println(s4 == s5);

		String s6 = s1 + s2;
		String s7 = new String("byyyy");

		System.out.println(s6 == s7);

		Integer i = new Integer("10");
		Integer i1 = 20;
		System.out.println(i==i1);
		
		Integer p = new Integer("55");
		Integer p1 = new Integer("55");
		System.out.println(p==p1);

		
		Integer m =10;
		Integer n =10;
		System.out.println(m==n);
	}
}