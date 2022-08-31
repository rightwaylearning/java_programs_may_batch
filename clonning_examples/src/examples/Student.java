package examples;

public class Student implements Cloneable {
	int age;
	int weight;

	public static void main(String[] args) throws Exception {
		Student s = new Student(); 
		s.age = 32;
		s.weight = 81;
		
		
		Student copy =(Student) s.clone();
		
		System.out.println(s.hashCode());
		System.out.println(copy.hashCode());
		
		copy.weight = 78;
		
		
		System.out.println(s.age);
		System.out.println(s.weight);
		
		System.out.println(">>>>>>>>");
		
		System.out.println(copy.age);
		System.out.println(copy.weight);
	}
}
