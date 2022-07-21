package instance_block_evening;

public class StaticBlockExample {

	 int a;
	 static int b;
	
	{
	 System.out.println("i am instance first block");
	 this.a =100;
	 StaticBlockExample.b =200;
	}
	
	static {
		System.out.println("i am static first block");
		StaticBlockExample.b =10;
	}
	
	StaticBlockExample(){
		System.out.println("i am constructor block");
		this.a =20;
		StaticBlockExample.b=20;
	}
	
	void m1() {
		System.out.println("i am instance method");
		this.a =10;
		StaticBlockExample.b =20;
	}
	
	static void m2() {
		System.out.println("i am static method");
		StaticBlockExample.b =20;
	}
	
	public static void main(String[] args) {
		System.out.println("I am main method start point");
		StaticBlockExample obj=new StaticBlockExample();
		StaticBlockExample.b =20;
		obj.a =1000;
		obj.m1();
		StaticBlockExample.m2();
		System.out.println("I am main method end point");
	}
	
	{
		System.out.println("i am instance second block");
		this.a = 10;
		StaticBlockExample.b =20;
	}
	
	static {
		System.out.println("i am static second block");
		b =100;
	}
}
