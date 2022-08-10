package PrimptiveToWrapper;

public class WrapperToPrimptive {

	public static void main(String[] args) {

		Integer i = 20;
		i.intValue();
		System.out.println(i);

		Byte b = 77;
		b.byteValue();
		System.out.println(b);

		Short s = 667;
		s.shortValue();
		System.out.println(s);

		Long l = 67l;
		l.longValue();
		System.out.println(l);

		Double d = 45d;
		d.doubleValue();
		System.out.println(d);

		Float f = 98f;
		f.floatValue();
		System.out.println(f);

		Character ch = 'S';
		ch.charValue();
		System.out.println(ch);

		Boolean b1 = false;
		b1.booleanValue();
		System.out.println(b1);

	}
}
