package instance_block_evening.copy;

public class InstanceBlockFlow {
	int a;
	int b;

	{
		a = 10;
		b = 20;
	}

	InstanceBlockFlow() {
		System.out.println(this.a);
		System.out.println(this.b);
		this.a = 77;
		this.b = 88;
	}

	public void m1() {
		this.a = 100;
		this.b = 200;
	}

	public static void main(String[] args) {
		InstanceBlockFlow instance = new InstanceBlockFlow();
		instance.m1();
		System.out.println(instance.a);
		System.out.println(instance.b);
	}

	{
		System.out.println(this.a); 
		System.out.println(this.b);
		this.a = 777;
		this.b = 888;
	}

}
