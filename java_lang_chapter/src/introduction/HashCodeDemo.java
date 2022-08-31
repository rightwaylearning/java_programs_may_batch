package introduction;

class Demo{
	int a;
	int b;
	
	@Override
	public int hashCode() {
		return (this.a + this.b)*1234;
	}
}

public class HashCodeDemo {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.a =10;d.b =20;
		System.out.println(d.hashCode());
		
		Demo d1 = new Demo();
		d1.a =10; d1.b =20;
		System.out.println(d1.hashCode());
		
		Demo d2 = new Demo();
		d2.a =11; d2.b =22;
		System.out.println(d2.hashCode());
		
		Demo d3 = new Demo();
		d3.a =11; d3.b =22;
		System.out.println(d3.hashCode());
		
		System.out.println("----------------");
		
		String s = "sachin";
		System.out.println(s.hashCode());
		String s1 = "sachin";
		System.out.println(s1.hashCode());
		
		Integer  i =100;
		Integer  j = 100;
		
		
		
	}

}
