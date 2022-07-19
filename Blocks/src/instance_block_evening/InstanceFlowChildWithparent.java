package instance_block_evening;

class Parent{
	int a = 10;
	{
		System.out.println("I am instance block of Parent");
	}
	Parent(){
		System.out.println("I am parent Construtor");
	}
	{
		System.out.println("I am second block of parent");
	}
	
}

public class InstanceFlowChildWithparent extends Parent{

	int b = 1000;
	{
		System.out.println("I am instance block of child");
	}
	InstanceFlowChildWithparent(){
		System.out.println("I am child construtor");
	}
	
	public static void main(String[] args) {
		InstanceFlowChildWithparent obj = new InstanceFlowChildWithparent();
	}
	
	{
		System.out.println("I am second block of child class");
	}
}
