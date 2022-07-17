package methodoveloading;

public class MethodSignatureExample {

	void m1(int a, int b) { //m1(int, int)
		
	}
	
	int m1(int m, int n, int c) { //  //m1(int, int, it)
		return 0;
	}
	
	void m1(float a, float b) {  // m1(float,float)
		
	}
	
	void m1(int s,float f) {  // m1(int,float)
		
	}
	
	
	
	
	public static void main(String[] args) {
		MethodSignatureExample ms = new MethodSignatureExample();
		ms.m1(10.10f, 67.90F);
	}
}
