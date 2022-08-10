package PrimptiveToWrapper;

public class test {

	public static void main(String[] args) {

		int i = 10;
		Integer.valueOf(i);
		System.out.println(i);

		byte b = 20;
		Byte.valueOf(b);
		System.out.println(b);

		short s = 24;
		Short.valueOf(s);
		System.out.println(s);
		System.out.println("30");

		long l = 453;
		Long.valueOf(l);
		System.out.println(l);

		float f = 34.0f;
		Float.valueOf(f);
		System.out.println(f);

		double d = 90d;
		Double.valueOf(d);
		System.out.println(d);

		boolean b1 = true;
		Boolean.valueOf(b1);
		System.out.println(b1);

		Character c = 'A';
		Character.valueOf(c);
		System.out.println(c);

	}

}
