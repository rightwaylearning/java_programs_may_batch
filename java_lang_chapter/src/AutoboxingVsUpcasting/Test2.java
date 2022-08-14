package AutoboxingVsUpcasting;

public class Test2 {

	void m1(Integer i) {
		System.out.println("I am integer i param method");
	}
	
	void m1(Number n) {
	  System.out.println("I am Number n param method");	
	}
	
	void m1(byte i) {
		System.out.println("I am float i param method");
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		int i = 10;
		t.m1(i); // match, upcasting, boxing   
		// t.m1(Integer.valuOf(i));
	}
}
