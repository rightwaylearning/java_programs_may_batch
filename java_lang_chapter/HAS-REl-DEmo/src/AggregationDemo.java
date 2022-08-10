
public class AggregationDemo {

	public static void main(String[] args) {
		
		Add a = new Add();
		Sub s = new Sub();
		
		Operation o =new Operation();
		
		
		o.a = a;
		o.s = s;
		
		o.doOperation();
		
		o =null;
		
	}
}
