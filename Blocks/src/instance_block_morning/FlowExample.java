package instance_block_morning;

public class FlowExample {

	{System.out.println("5");}
	static {System.out.println("1");} // 1
	FlowExample(){
		System.out.println("8");
	}
	{System.out.println("6");}
	static {System.out.println("2");}
	void m1() {
		System.out.println("9");
	}
	static void m2() {
		System.out.println("10");
	}
	public static void main(String[] args) {
		System.out.println("4");
		FlowExample f = new FlowExample();
		f.m1();
		FlowExample.m2();
	}
	{System.out.println("7");}
	static {System.out.println("3");}
}
