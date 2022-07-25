package HashCodeExample;



class Student {

	int rollNumber;

}

public class HashCode {
	public static void main(String[] args) {
		Student s = new Student();
		s.rollNumber = 10;
		System.out.println(s.hashCode());

		Student s1 = new Student();
		s1.rollNumber = 20;
		System.out.println(s1.hashCode());

		Student s2 = s;
		s2.rollNumber = 56;
		System.out.println(s2.hashCode());

	}

}
