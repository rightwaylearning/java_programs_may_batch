package methodoveloading;

public class MethodOverloadExample {

	int a;
	int b;
	
	// yes we can overload constructor 
	
	MethodOverloadExample(){
		this.a = 10;
		this.b = 20;
	}
	
	MethodOverloadExample(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// we can overload main method
	// we can overload static method yes we can
	public static void main(String[] args) {
		
	}
	
    public static void main(String args) {
		
	}
    // we can overload private method
    private void m1() {}
    private void m1(int a) {}
    
    
    
}
