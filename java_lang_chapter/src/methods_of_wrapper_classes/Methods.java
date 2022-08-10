package methods_of_wrapper_classes;

public class Methods {

	public static void main(String[] args) {
		
		byte b = 10;
		Byte b1=new Byte(b); // public Byte(byte b){}
		Byte b2= new Byte("10"); // public Byte(String b){}
	
	    // byte ,short, int, log, double, boolean
		
		// float 2 + 1  = 3
		
		//character  1
		
		char c = 'A';
		Character ch = new Character(c);
		
		// 8 classes  4 method very useful methods
		
		int a =10;
		Integer i = Integer.valueOf(a);
		int original = i.intValue();
	
		
		float f = 23.78f;
		Float obj = Float.valueOf(f);
		float value = obj.floatValue();
		
		
		// Integer.valueOf(int a);
		// i.intValue();
		
		String data = "10";
	    String boo = "true";
	    
	    int iii = Integer.parseInt(data);
	    
	    boolean status = Boolean.parseBoolean(boo);
	    
		
		String data1 = "10";
		
		Integer obj1 = Integer.valueOf(data1);
		
		
		String sss = obj1.toString();
		
		
		
		int p = 10;
		
		String pp = Integer.toString(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
