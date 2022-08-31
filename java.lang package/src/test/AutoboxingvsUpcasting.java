package test;

public class AutoboxingvsUpcasting {
	


	void m1(int a) {
		System.out.println("I am int a param method");
	}
	
	void m1(byte b) {
		System.out.println("I am byte b param method");
	}
	
	void m1(Integer i) {
		System.out.println("I am Integer i param method");
	}
	
	void m1(Object o) {
		System.out.println("I am Object o param method");
	}
	
	void m1(Byte b) {
		System.out.println("I am Byte b param method");
	}
	
	public static void main(String[] args) {
		AutoboxingvsUpcasting a = new AutoboxingvsUpcasting();
	
		
		Byte i = 10;
		a.m1(i); 
		int j =20;
		a.m1(j);
		
		
		

}
}
