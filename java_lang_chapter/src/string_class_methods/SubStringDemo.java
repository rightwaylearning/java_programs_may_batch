package string_class_methods;

public class SubStringDemo {

	public static void main(String[] args) {
		
		String s = "Good morning india.";
		System.out.println(s.length());
		
		String subStr = s.substring(13);
		System.out.println(subStr);
		
		// substring(int offset, int endpoint)
		//offset  >> start from this index
		//endpoint >> stop endpoint-1
	    String s1 = "anupama parmeshwaram";	
	    System.out.println(s1.substring(0,7));
	    
	    String s2 = "nayan tara";
	    System.out.println(s2.substring(0,5));
		
		String gg= new String("");
		
		
		String hh = "abc";
		String jj = "ABC";
		
		System.out.println(hh.equalsIgnoreCase(jj));
		
		
		 String s11 = "Hi goog morning india welcome.";
		 String s111 = s11.substring(8);
		 
		 System.out.println(s111);
		 
		 String s22 = s11.substring(8,21); // 8 to 20
		 System.out.println(s22);
		 System.out.println(s11.length());
		 
		 //==========================================
		 
		 String str = "Hi Hello sir good morning";
		 System.out.println(str.toUpperCase());
		 
		 str = "HI HELLO HOW ARE YOU.";
		 System.out.println(str.toLowerCase());
		 
		 str= "     hi hello     ";
		 System.out.println(str);
		 System.out.println(str.trim());
		 
		 str = "hi hello how are you.";
	     int index =str.indexOf('o');
	     System.out.println(index);
	     index =str.lastIndexOf('o');
	     System.out.println(index);

		
	}
}
