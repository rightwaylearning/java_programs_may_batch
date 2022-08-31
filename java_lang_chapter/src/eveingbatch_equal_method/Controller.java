package eveingbatch_equal_method;

class Student {
	int rollNumber;
	Student(int rollNumber){
		this.rollNumber = rollNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
	    Student s1 = (Student)obj;
		if(this.rollNumber == s1.rollNumber) {
			return true;
		}else {
			return false;
		}
	}
}

public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student(10);
		Student s1 =s;
		
	
		System.out.println(s==s1); // true
		System.out.println(s.equals(s1)); // true%100
		
		
		
	
		
	}
}
