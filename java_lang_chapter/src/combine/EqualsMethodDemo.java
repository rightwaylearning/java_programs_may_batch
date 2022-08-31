package combine;

class Foo{
	int age;
	int id;
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Foo) {
//			Foo f1 =(Foo)obj;
//			if(f1.id == this.id && f1.age == this.age) {
//				return true;
//			}
//		}
//		return false;
//		
//    }
}

class Student1{}

public class EqualsMethodDemo {

	public static void main(String[] args) {
		
		Foo f = new Foo();
		f.id = 10; f.age =10;
		Foo f1 = new Foo();
		f1.id = 11; f1.age =10;
		System.out.println(f.equals(new Student1()));
	}
}
