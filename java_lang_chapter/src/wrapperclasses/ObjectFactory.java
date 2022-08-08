package wrapperclasses;

public class ObjectFactory {

	
}

class Student{
	Integer rollNumber;
	String name;
	
	static Student getStudentObject(){
		Student s =new Student();
		return s;
	}
}
