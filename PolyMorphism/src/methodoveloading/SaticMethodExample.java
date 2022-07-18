package methodoveloading;



class H{
	static void m1() {
		System.out.println("I am parent");
	}
}

class I extends H{
	
	static void m1() {
		System.out.println("I am Child");
	}
}

public class SaticMethodExample {

	public static void main(String[] args) {
      
		H h= new I();
		h.m1();
	}
}
