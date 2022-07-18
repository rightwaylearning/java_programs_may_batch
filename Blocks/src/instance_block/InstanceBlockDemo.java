package instance_block;

public class InstanceBlockDemo {
	int a;
	int b;

	{
		System.out.println("i am first instance block");
	}
	InstanceBlockDemo() {
		System.out.println("i am constructer");
	}
	
	{
		System.out.println("I am instance block");
	}	

	public static void main(String[] args) {
		System.out.println("I am main method");

		InstanceBlockDemo i = new InstanceBlockDemo();

	}


}
