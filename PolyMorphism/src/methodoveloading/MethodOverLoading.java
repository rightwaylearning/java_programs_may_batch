package methodoveloading;

public class MethodOverLoading {

	void m1(Object o) {
		System.out.println("I am Object");
	}
	
	void m1(Number n) {
		System.out.println("I am Number");
	}
	
	void m1(Integer i) {
		System.out.println("I am Integer");
	}
	
	
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		
		m.m1(10);
		m.m1(10.10);  // Number n= new Double();
		m.m1("abc");  // Object o = any thing
		m.m1(null);
	}
}
