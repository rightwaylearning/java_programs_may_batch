
public class DiffBetweenEqualsAndDoubleassign {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.name = 100;
		
		Student s1 = new Student();
		s1.name = 110;

		System.out.println(s == s1); // object class logic
		
		System.out.println(s.equals(s1)); // my override method
		
	}		
	
}

class Student{
	int name;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s1 = (Student)obj;
			if(this.name == s1.name) {
				return true;
			}
		}
				
		return false;
	}

}