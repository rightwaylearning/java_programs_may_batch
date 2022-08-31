
public class CompositionDemo {

	public static void main(String[] args) {
		
		 	
		Operation o =new Operation();
		
		
		o.a =new Add();
		o.s =new Sub();
		
		o.doOperation();
		
		o =null;
	}
}
