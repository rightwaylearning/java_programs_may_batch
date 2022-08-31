package combine;

class Stident{}

class Employee{
	String name;
	
	Employee(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

public class HashCodeWithtoStringDemo {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		
		String str1 = new String("Hello");
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		
		Stident s = new Stident();
		Stident s1 = new Stident();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
				
		
		System.out.println(str);
		System.out.println(str.toString());
		
		Employee e = new Employee("John");
		
		System.out.println(e);
		System.out.println(e.toString());
		
		
		
		
		
	}
}
