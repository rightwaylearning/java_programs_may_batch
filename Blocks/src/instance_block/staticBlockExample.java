package instance_block;

public class staticBlockExample {

	static {
		System.out.println("I am first static block");
	}
	{
		System.out.println("I am first instance block");
	}

	staticBlockExample() {
		System.out.println("I am constrctor");
	}

	public static void main(String[] args) {
		staticBlockExample o = new staticBlockExample();
		System.out.println("I am main method");
	}
	
	static {
		System.out.println("I am second static block");
	}
	
	{
		System.out.println("I am second instance block");
	}
}
