package examples;

class Emp{
	int empId;
	int experiance;
}

public class Controller {

	public static void main(String[] args) {
		Emp e = new Emp();
		  e.empId = 23;
		  e.experiance = 10;
		  
		Emp e1 = e;
		e1.experiance = 11;
		
		System.out.println(e.empId);  // 23
		System.out.println(e.experiance); // 11
		System.out.println(">>>>>>>>>>>>>>");
		System.out.println(e1.empId); // 23
		System.out.println(e1.experiance); // 11
	}
}
