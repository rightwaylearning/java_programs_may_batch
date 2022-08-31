package morning_batch;



class Test {
	int num;
	int num1;

	public static void main(String[] args) {
		
	}
}

class Employee{
	int empId;
	String name;
	
	@Override
	public int hashCode() {
		return this.empId;		
	}
}

public class hashCodeOverriding {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empId = 23;
		e1.name = "Ramarao";
		System.out.println(e1.hashCode());
		
		Employee e2 = new Employee();
		e2.empId = 25;
		e2.name = "ramCharan";
		System.out.println(e2.hashCode());
	}
}
