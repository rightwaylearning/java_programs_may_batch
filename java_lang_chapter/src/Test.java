
public class Test  implements Cloneable{
	
	int i =10;
	int j =20;
	public static void main(String[] args)throws Exception  {
		Test t1 = new Test();
		Test t2 =(Test)t1.clone();
		
		t2.i=999;
		t2.j=888;
		System.out.println(t1.i + " ----------------   "+ t1.j);
		System.out.println(t2.i + "  ----------------   " +t2.j);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.toString());
		System.out.println(t2.hashCode());
	}

}
