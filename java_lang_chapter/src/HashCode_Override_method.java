
class Student11{
	int a ;
	int b;
	
	@Override
	public int hashCode() {
		final int  c= 1990;
		return (this.a + this.b) * c;
	}
}


public class HashCode_Override_method {

	public static void main(String[] args) {
	
		Student11 s = new Student11();
		s.a = 100;
		s.b = 200;
		System.out.println(s.hashCode());
		Student11 s1 = new Student11();
		//---------------------
		s1.a = 200;
		s1.b = 100;
		System.out.println(s1.hashCode());
	}
}
