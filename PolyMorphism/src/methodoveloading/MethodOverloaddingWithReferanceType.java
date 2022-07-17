package methodoveloading;

public class MethodOverloaddingWithReferanceType {

	void m1(String s) {
		System.out.println("I am String method");
	}
	
	void m1(StringBuffer b) {
		System.out.println("I am StringBuffer method");
	}
	
	public static void main(String[] args) {
		MethodOverloaddingWithReferanceType m = null;
		m = new MethodOverloaddingWithReferanceType();
		
		// case 1 perfect match
		//----------------------------------
		String s = new String("abc");
		m.m1(s); // OR m.m1("abc");
		
		StringBuffer b = new StringBuffer("abc");
		m.m1(b);
		//------------------------------------
		// case we are passing null to overloaded method
		
		m.m1(null);
		// both method are allow null value so ambiguty error
	}
}
