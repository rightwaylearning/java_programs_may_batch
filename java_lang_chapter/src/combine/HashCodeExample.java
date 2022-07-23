package combine;

class Society{
	
	@Override
	public int hashCode() {
		return 5;
	}

	@Override
	public String toString() {
		return "NO OUTPUT";
	}
	
	
	
}

class Town{
	
}



public class HashCodeExample {

	public static void main(String[] args) {
		Society s = new Society();
		System.out.println(s); // s.toString()
		
		Town t = new Town();
		System.out.println(t); // t.toString();
		
	}
}
