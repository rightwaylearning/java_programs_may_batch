package PrimptiveToWrapper;

public class PrimptiveStringCombination {

	public static void main(String[] args) {
		int i = 10;
		Integer.toString(i);
		System.out.println(i);

		byte b = 66;
		Byte.toString(b);
		System.out.println(b);

		double d = 689d;
		Double.toString(d);
		System.out.println(d);

		float f = 8f;
		Float.toString(f);
		System.out.println(f);

		long l = 97l;
		Long.toString(l);
		System.out.println(l);

		Character ch1 = 'A';
		Character.toString(ch1);
		System.out.println(ch1);

		boolean b1 = true;
		Boolean.toString(b1);
		System.out.println(b1);

		short s = 56;
		Short.toString(s);
		System.out.println(s);

		///////////////// String to primitive
		System.out.println("===========================");

		String s1 = "10";
		Integer.parseInt("10");
		System.out.println(s1);

		String s2 = "40";
		Byte.parseByte(s2);
		System.out.println(s2);

		String s3 = "30";
		Long.parseLong(s3);
		System.out.println(s3);

		String s4 = "50";
		Short.parseShort(s4);
		System.out.println(s4);

		String s5 = "90";
		Double.parseDouble(s5);
		System.out.println(s5);

		String s6 = "900";
		Boolean.parseBoolean(s6);
		System.out.println(s6);

	}

}
