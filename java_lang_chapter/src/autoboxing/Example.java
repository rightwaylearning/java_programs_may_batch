package autoboxing;

public class Example {

	public static void main(String[] args) {
		
		Test t = new Test();
		int x = 10;
		t.m1(x); // t.m1(Integer.valueOf(x))
		// autoboxing
		
		Integer i = Integer.valueOf(100);
		t.m2(i); // t.m2(i.intValue()) // Autounboxing
	}
}
