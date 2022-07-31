package examples;


class Compnay{
	String name;
}
public class Employee  implements Cloneable{
 
	int empiId;
	int exp;
	Compnay companyName;	
	
	public static void main(String[] args)  throws Exception{
		Employee e = new Employee();
		   e.empiId = 23;
		   e.exp = 10;
		   e.companyName = new Compnay();
		   e.companyName.name = "IBM";
		  
		
		   
		   Employee copy = (Employee) e.clone();   
		
		   copy.companyName.name = "LTI";
				   
				    
		System.out.println(e.empiId);
		System.out.println(e.exp);
		System.out.println(e.companyName.name);
		
		
		System.out.println(">>>>>>>>>>>>>>>");
		
		System.out.println(copy.empiId);
		System.out.println(copy.exp);
		System.out.println(copy.companyName.name);
	}
}
