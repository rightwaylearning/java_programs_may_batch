package introduction;


class A{
	
	@Override
	public int hashCode() {
		return 100;
	}
}
public class Intro {

	public static void main(String[] args) {

		A a=new A();
		
		System.out.println(a.hashCode());
		
	}
}




