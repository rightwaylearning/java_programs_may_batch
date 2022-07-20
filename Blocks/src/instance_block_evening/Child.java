package instance_block_evening;

 class A {
	static int a = 10;
	static {
      System.out.println("I am first static block");
	}
	static void m1() {
		System.out.println(y);
	}
	static {
	  System.out.println("I am second static block");
	}
	static int  y =  200;
}

public class Child extends A{
	static int a =  100;
	static {
      System.out.println("I am first static block -- Child");
	}
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		System.out.println(y);
	}
	static {
	  System.out.println("I am second static block -- Child");
	}
	static int  y = 2000;
}


