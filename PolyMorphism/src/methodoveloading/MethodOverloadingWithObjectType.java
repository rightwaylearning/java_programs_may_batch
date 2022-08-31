package methodoveloading;

public class MethodOverloadingWithObjectType {

	void m1(String s) {
		System.out.println("I am String method");
	}
	
	void m1(Object o) {
		System.out.println("I am object method");
	}
	
	public static void main(String[] args) {
		MethodOverloadingWithObjectType m =null;
		m = new MethodOverloadingWithObjectType();
		
//		m.m1("xyz");
//		m.m1(new Emp());
		
		m.m1(null);
	}
}

class Emp{}