package evening_batch;

class Student{
	private int rollNumber;
	
	public Student(int rolllNumber) {
		this.rollNumber = rolllNumber;
	}
	
	@Override
	public boolean equals(Object obj) {  
		if(obj instanceof Student) {
			Student obj1 = (Student)obj;
			if(this.rollNumber == obj1.rollNumber) {
				return true;
			}
		}
			
		return false;
		
	}
}


public class EqualMethodOverriding {

	public static void main(String[] args) {
		Student s1 = new Student(11);
		Student s2 = new Student(10);
		
		boolean status = s1.equals(s2); 
		System.out.println(status);
		// objcet class equal method chcek with == operator
		byte b1 =20;
		Byte b =new Byte(b1);
		byte b4 = 20;
		Byte b2 = new Byte(b4);
		System.out.println(b.equals(b1));
	}
}
