package combine;

class Student {
	String name;
	int rollNumber;

	@Override
	public String toString() {
		return "Student (name=" + name + ", rollNumber=" + rollNumber + ")";
	}

}

public class ToStringMethodDemo {

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "Pawan";
		s.rollNumber = 10;

		System.out.println(s);
		
		String s1 ="sachin";
		System.out.println(s1.toString());

	}
}
