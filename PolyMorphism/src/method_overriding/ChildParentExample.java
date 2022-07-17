package method_overriding;

class P {
	 Number m1(Object a) {
		System.out.println("I am from parent class");
		return 0;
	}
}

class C extends P {
	@Override
	Double m1(Object aa) {
		System.out.println("I am from child class");
		return 0.0;
	}

}

public class ChildParentExample {

	public static void main(String[] args) {

		P p = new C();
		p.m1();
	}
}
