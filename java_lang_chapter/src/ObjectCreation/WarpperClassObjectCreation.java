package ObjectCreation;

public class WarpperClassObjectCreation {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		
		Integer ii = Integer.valueOf(10);
		Integer iii = 10;	
		
		//System.out.println(ii == iii); true
		// System.out.println(i == iii); // false
		//System.out.println(i ==ii);  // false
		
		//-----
		
		Integer k = 100; // Integer.valueOf(100);
		Integer l = 100; // Integer.valueOf(100);
		Integer j = Integer.valueOf(100);
		Integer g = new Integer(100);
	//	System.out.println(k ==l); // true
	//	System.out.println(l == j); // true 
	//	System.out.println(j ==g); // false
		
		
		
		
		Integer n = 130;
		Integer n1 = Integer.valueOf(130);
		Integer n2 = new Integer(130);
		
		System.out.println(n==n1); // false
		System.out.println(n1==n2); // false 
		System.out.println(n==n2); // false
		
		
		Integer o = 127;
		Integer o1 = Integer.valueOf(128);
		
		
		Float f = 67.90F;
		Float f1 = Float.valueOf(67.90F);
		Float f2 = new Float(67.90F);
		
	//	System.out.println(f == f1); // false
	//	System.out.println(f1 ==f2); // false
	//	System.out.println(f ==f2); // false
		
		Float f4 = 10.00F;
		Float f5 = 10.00f;
		System.out.println(f4==f5);// false
	
		// ======
	
		
		
		
	
		
		
	}
}
