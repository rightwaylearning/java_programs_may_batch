package morning_batch;

class Student{
	String name;
}

public class HashCodeDemo1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Anupama parmeshwaram";
		System.out.println(s1.hashCode());
		
		Student s2= new Student();
		s2.name = "Anupama parmeshwaram";
		System.out.println(s2.hashCode());
		
		Student s3 = s1;
		System.out.println(s3.hashCode());
	}
}
