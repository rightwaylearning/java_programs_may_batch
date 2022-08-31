package coontrcat_between_shacode_equals_method;

class Student {
	int a;
	int b;

	Student(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {
		return this.a + this.b;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.a == s.a && this.b == s.b) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

public class Controller {
	public static void main(String[] args) {

		 Student s1= new Student(10,20);
		 Student s2= new Student(10,20);
		 System.out.println("==== Ruel 1=======");
		 System.out.println(s1.equals(s2)); // true
		 System.out.println(s1.hashCode()); // 
		 System.out.println(s2.hashCode());//
		 
		 System.out.println("==== Ruel 2=======");
		 Student s3= new Student(10,20);
		 Student s4= new Student(20,100);
		 System.out.println(s3.equals(s4)); // false
		 System.out.println(s3.hashCode()); // 
		 System.out.println(s4.hashCode());//
		 
		 
		 
		 
		// equals ()
		 
	//	 1] equals  >> true 100% s1.hasCode() == s2.hashCode()
				 
				 
	//	 2]  equals >> false  >>>>>>>>>>>> true or false
				 
				 
				 
	//     hashCode
	     
//	     3] s1.hasCode() == s2.hashCode() >> true
		  // in that case equals method may be true or false
	    		 
	    		 
//	     4] s1.hasCode() == s2.hashCode() >> false
		 // equals >> 100% I am false;
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
