package string_stringbuffer_stringbuider;

public class ProgramOnLiteral {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);   // s.toString()
		s.m1();
		System.out.println(s.a);
		
		// string_stringbuffer_stringbuider.Student@626b2d4a
		
		int[][] arr = new int[10][];
		System.out.println(arr);
		System.out.println(arr.length);
		
		// [[I   @5e265ba4
		
		short[] aaaa = {};
		System.out.println(aaaa);
	}
}

class Student{
	int a;
	void m1() {}
}