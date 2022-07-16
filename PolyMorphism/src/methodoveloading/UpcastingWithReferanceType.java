package methodoveloading;

public class UpcastingWithReferanceType {

	
	void m1(Double o) {
		System.out.println("Object method");
	}
	
	void m1(Number n) {
		System.out.println("Number method");
	}
	
	
	
	public static void main(String[] args) {
		
		UpcastingWithReferanceType u = new UpcastingWithReferanceType();
	    
		u.m1(null);  
	}
}

class Student{
	
}