import javax.management.ValueExp;

public class AutoBoxingANDAutoUbboxing {

	public static void main(String[] args) {
		
		Test t= new Test();
		
		int i =10;
		t.m1(i); //t.m1(Integer.valueOf(i)); 
		
		
		Integer x = Integer.valueOf(20);
		t.m2(x); // t.m2(x.intValue()) // 
		
		
		
		
	
		Integer  k = 100;
		Integer  k1 = 100;
		Integer  k2 = Integer.valueOf(100);
		
		Integer k3 = new Integer(100);
		
		System.out.println(k==k1); // true
		System.out.println(k1==k2);// true
		System.out.println(k2==k3); // false
		
		
		
		
		
		
		
		
		
		
	}
}
