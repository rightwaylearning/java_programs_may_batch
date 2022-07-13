package methodoveloading;

public class AutomaticPramotionCE {

	void sum(int a, float f) {
		System.out.println("int  , float combination");
	}
	
	void sum(float f, int a) {
		System.out.println("float , int combination");
	}
	
	public static void main(String[] args) {
		AutomaticPramotionCE a = new AutomaticPramotionCE();
		
		a.sum(10,10);
	}
}
