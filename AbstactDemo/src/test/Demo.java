package test;

abstract class P {
	abstract void m1();

	void m2() {
		System.out.println("i am from P class m2 method");
	}
}

class C extends P {
	void m1() {
		System.out.println("i am from C class m1 method");
	}
}

public class Demo {
	public static void main(String[] args) {

		P p= new C();
	}
}
