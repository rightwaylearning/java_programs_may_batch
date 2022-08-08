package wrapperclasses;

public class BasicKTOnWrapperClasses {

	public static void main(String[] args) {
		
	  // 8 wrapper classes object creation
	  // constructors
		
	  // 1] byte
		
		// 10
		byte b1 =10;            
		Byte b = new Byte(b1);  // public Byte(byte b){}
		Byte b2 = new Byte("100");// public Byte(String b){}
		
		//Byte b3 = new Byte("abc"); //R.E  NumberFornattException
		
		short s1 =10;
		Short s = new Short(s1); // public Short(short value){}
		Short s2 = new Short("10");
		
		int i1 =10;
		Integer i = new Integer(i1);
		Integer  i2 = new Integer("100000");
		
		long l1 =10000L;
        Long l = new Long(l1);	
        Long l2 =new Long("1235757");
        
        Double d = new Double(10.00);
        Double d1 = new Double("10.8900");
        
        
        Float f = new Float(10.00F);
        Float f2 = new Float("10.000f");
        Float f3 = new Float(10.00);
        Float f3 = new Float("10.000");
        
        boolean b12 =true;
        Boolean b11 = new Boolean(b12); // true
        Boolean b22 = new Boolean("false");
        
        
        Character ch = new Character('A');
        
        
        
        
        
        
	}
}
