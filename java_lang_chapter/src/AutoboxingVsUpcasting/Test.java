package AutoboxingVsUpcasting;



public class Test {

	void m1(int a) {
		System.out.println(">>>>>>>>>"+a);
	}
	
	public static void main(String[] args) {
		Test t= new Test();
		// case 1;
		t.m1(10);
		int a =10;
		t.m1(a);
		byte b =10; // short b =10;
		t.m1(b);
		// -----------------------
		// case 2
		Integer i =10; // Integer i =.Integer.valueOf(10);
		Integer i1 =new Integer(10);
		t.m1(i1);
		// case 3
		byte b2 =100;
		Byte b1 = new Byte(b2);
		
		t.m1(b1);// t.m1(b1.byteValue())
		
		
		
	}
}
