package control_floe;

class Parent{
	static int a = 100;  // 1
	static {System.out.println("I am first parent block");}  // 2
}

public class StaticControllFlow extends Parent{
    static int b = 200;  // 3
    static { 
    	System.out.println("I am first child block");
    	m1();
    }  // 4
	public static void main(String[] args) {
		m1();
	}  // 5
	static void  m1() { // 6
		System.out.println(y); // 0
	}
	static int y = 300;  // 7
}

//1] find out static component from top to bottom
//2] top to bottom execute init variables & run static block only
// 3] main