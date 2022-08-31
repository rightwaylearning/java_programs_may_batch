package methodoveloading;

public class MethodVaibalePramotion {

		
	void m1(int a, short b) {
	   System.out.println("int, float");	
	}
		
	public static void main(String[] data) {
		
		MethodVaibalePramotion m = new MethodVaibalePramotion();

	    byte b = 10;  short s = 10;
		m.m1(b,10);
		
	}
}
