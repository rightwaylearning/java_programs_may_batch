package instance_block;

public class InstanceBlockSequenceOfRun {

	{
		System.out.println("I am first");
	}

	InstanceBlockSequenceOfRun() {
		System.out.println("I am constructer");
	}

	{
		System.out.println("I am second");
	}

	{
		System.out.println("I am third");
	}
}
