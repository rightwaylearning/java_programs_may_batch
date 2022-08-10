package Clonable;

public class EmployeeClone implements Cloneable {
	
	int empid;
	int empage;
	String empName;
	

	
	
	
	public static void main(String[] args) throws Exception {
		
		EmployeeClone e =  new EmployeeClone();
		
		e.empid=100;
		e.empage=20;
		e.empName="Sonali";
		
		EmployeeClone copy = (EmployeeClone) e.clone();
		
		copy.empName="ABC";
		
		
		System.out.println(e.empid);
		System.out.println(e.empage);
		System.out.println(e.empName);
		
		
		System.out.println(copy.empage);
		System.out.println(copy.empid);
		System.out.println(copy.empName);
	}

}
