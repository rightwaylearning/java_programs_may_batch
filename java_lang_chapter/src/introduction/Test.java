package introduction;

class Student{
	int rollNumber;
	@Override
	public int hashCode() {
		return this.rollNumber;
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		
		
		
		
		Student s = new Student();
		s.rollNumber = 21;
		System.out.println(s.hashCode()); // 21
		System.out.println(">>>>>>>>");
		Student s1 = new Student();
		s1.rollNumber = 24;
		System.out.println(s1.hashCode()); // 24
	
		
		Student s2 = s;
		System.out.println(s2.hashCode()); // 21
		
	
	}
}
