package ToStringMethod;

public class Controoler {

	public static void main(String[] args) {
		Student s = new Student();
		s.rollNumber = 23;
		s.studenytName = "Pawan kalyan";
		
		String data = s.toString();
		
		System.out.println(data); 
		
		
	//	System.out.println(s.toString());
		
	 String s1=new String("abc");
	 System.out.println(s1);
	 // ========================================
	 
	 int a = 10;
	 Integer i = Integer.valueOf(a);  /// valueOf(p)
	 
	 int myPrimitve = i.intValue(); // intValue() ; 
	 
	 String ii = i.toString();
	 
	 Integer newObj = Integer.valueOf(ii);
	 
	 
	 String j = "100";
	 int pri = Integer.parseInt(j);
	 
	 
	 String actual = Integer.toString(pri);
	 
	 
	char ch ='A';
	Character ch1 = Character.valueOf(ch);
	char ch2 = ch1.charValue();
	 

	
	 //int x8 = x9.intValue();
	 
	 
	
	
	
	
	
	
	
	
	Integer x9 = new Integer(10);
	String str = x9.toString(); // "10"
	
	String str1 = "100";
	
	Integer i8 = Integer.valueOf(str);
	
	 
	int i7 = Integer.parseInt(str1);
	
	String str7 = Integer.toString(i7);
	
	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
