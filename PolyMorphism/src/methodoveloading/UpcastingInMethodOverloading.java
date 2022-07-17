package methodoveloading;

public class UpcastingInMethodOverloading {

	void m1(double a, float b) {}
	
	
	public static void main(String[] args) {
		UpcastingInMethodOverloading u = new UpcastingInMethodOverloading();
		u.m1(10, 10);
		
	}
}
