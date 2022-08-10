
public class WrapperClassesExample {
	
	public static void main(String[] args) {
		
		
		int i =10;
		Integer i1 = new Integer(i);
		Integer i11 = new Integer("10");
		System.out.println(i);
		System.out.println(i11);
		
		Integer i111 = Integer.valueOf(i);
		Integer i11111 = Integer.valueOf("10");
		System.out.println(i111);
		
		Byte b=20;
		Byte b1 = new Byte(b);
		Byte b12 = Byte.valueOf(b);
		System.out.println(b);
	  Byte b123 = new Byte("20");
	   System.out.println(b);
	   
	   Short s = 50;
	   Short s1 = new Short(s);
	   System.out.println(s);
	   Short s12 = new Short("50");
	   System.out.println(s12);
	   
	   Short s123 = Short.valueOf(s);
	   System.out.println("50");
	   
	   Long l = new Long(23);
	   System.out.println(23);
	   
	   Long l1 = Long.valueOf(33);
	   System.out.println(l1);
	   
	   Double d = new Double(883);
	   System.out.println(d);
	   
	   Double d1 = Double.valueOf(d);
	   System.out.println(d1);
	   
	   Float f = new Float(67);
	   System.out.println(f);
	   
	   Float f1 = new Float(f);
	   System.out.println("67");
	   
	   Float f2 = new Float(667f);
	   Float f3 = Float.valueOf(f);
	   
	   Boolean B = new Boolean(true);
	   
	   Boolean B1 = Boolean .valueOf(false);
	   
	   System.out.println(B1);
	   
	   
	   Character ch = new Character('A');
	   Character ch1 = Character.valueOf('S');
	   System.out.println(ch);
	   System.out.println(ch1);
	   
	   
	   
	}

}
