package combine;

class Test{
	String name;
	int cityPin;
	
	Test(String name, int cityPin){
	   this.name = name;
	   this.cityPin = cityPin;
	}
	
	public int hashCode() {
	 return	this.name.length() + this.cityPin;
	}
	
	
}

public class OverrideHashCodeMethod {

	public static void main(String[] args) {
		Test t = new Test("Umesh",412356);
		System.out.println(t.hashCode());
		
		Test t1 = new Test("Lal",412356);
		System.out.println(t1.hashCode());
		
		Test t2 = new Test("Umesh",412356);
		System.out.println(t2.hashCode());
	}
}
