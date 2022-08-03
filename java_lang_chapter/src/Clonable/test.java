package Clonable;

public class test implements Cloneable {

	int age;
	int height;

	public static void main(String[] args) throws Exception {

		test t = new test();
		t.age = 66;
		t.height = 5;

		test copy = (test) t.clone();
		System.out.println(t.hashCode());
		System.out.println(copy.hashCode());

		copy.age = 50;
		copy.height = 88;

		System.out.println(t.age);
		System.out.println(t.height);
		
		
		System.out.println(copy.age);
		System.out.println(copy.height);
	}
}
