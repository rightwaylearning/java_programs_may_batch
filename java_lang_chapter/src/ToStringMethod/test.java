package ToStringMethod;

class Student {
	String name;
	int rollno;

	Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
}






public class test {
	public static void main(String[] args) {
		Student s = new Student("sonali" , 100);
		Student s1 = s;
		Student s2 = new Student("galande " , 200);
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s1);
		System.out.println(s2.toString());
	}

}
