package instance_block_evening;

public class Flow {

	{System.out.println("4");}  // fourth
	static {System.out.println("1");}  // first 
	Flow(){System.out.println("6");} // sixth
	public static void main(String[] args) {
		System.out.println("3"); // third
		Flow f = new Flow(); 
		System.out.println("7"); // seventh
	}
	{System.out.println("5");}  // fifth
	static {System.out.println("2");}  // second
}
