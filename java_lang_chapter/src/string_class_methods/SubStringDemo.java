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
		
		
		
	}
}
