package AutoboxingVsUpcasting;

public class Test1 {

//	void m1(int a) {
//		System.out.println("I am int a param method");
//	}
	
//	void m1(byte b) {
//		System.out.println("I am byte b param method");
//	}
	
	void m1(Integer i) {
		System.out.println("I am Integer i param method");
	}
	
	void m1(Object o) {
		System.out.println("I am Object o param method");
	}
	
//	void m1(Byte b) {
//		System.out.println("I am Byte b param method");
//	}
//	
	public static void main(String[] args) {
		Test1 t= new Test1();
	
		
		Byte i = 10;
		t.m1(i); //
		
		
	}
}
