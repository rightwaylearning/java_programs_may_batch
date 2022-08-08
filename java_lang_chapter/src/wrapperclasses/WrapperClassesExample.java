package wrapperclasses;

import combine.Book;

public class WrapperClassesExample {

	public static void main(String[] args) {
	
		//Student s = Student.getStudentObject();
		

		Integer j = new Integer(10); 
		Integer i = new Integer("10");
		
		Byte b1 = new Byte("2");
		byte b = 2;
		Byte b2 = new Byte(b);
		
		Short s1 = new Short("2");
		Short s = 2;
		Short s2 = new Short(s);
		
		Character ch = new Character('a');
	//	Character ch = new Character("a");
		
	    Float f = new Float(10.20F);
	    Float f1 = new Float("10.20F");
		
	    Float f2 = new Float(10.20);
	    Float f3 = new Float("10.20");
		
	    Boolean b111 = new Boolean(false);
	  
	    Boolean b11 = new Boolean("");
	    System.out.println(b11);
	    
	   System.out.println("==========");
	   //====================
	    Boolean f11 = new Boolean("NO"); //false
	    Boolean f22 = new Boolean("true"); // true
	    
	    System.out.println(f11.equals(f22));  // false
	   // 
	    
	   Float f99 = new Float("10.0");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
