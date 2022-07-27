
public class String_Emp_WRT_EQUAL_METHOD {

	public static void main(String[] args) {
		String s= new String("test");
		String s1= new String("test");
		
		System.out.println(s ==s1); // false 
		System.out.println(s.equals(s1)); // true
		
		System.out.println("----------------");
		Emp e = new Emp(10);
		Emp e1 = new Emp(10);
		System.out.println(e ==e1);  // false
		System.out.println(e.equals(e1)); // false
	}
}

class Emp{
	int id;
	Emp(int id){
		this.id = id;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Emp e1 = (Emp)obj;
//		if(this.id == e1.id) {
//			return true;
//		}
//		
//		return false;
//	}
}
