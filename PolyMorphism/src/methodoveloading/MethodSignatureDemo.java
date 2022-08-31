package methodoveloading;

public class MethodSignatureDemo {

	void m1(int a, int b) {}
	
	int m1(int m, int n,int c) {return 10;}
	
	void m1(float f, int a) {}
	
	void m1(int a, float f) {}
	
	void m1(float y, double r) {}
}
