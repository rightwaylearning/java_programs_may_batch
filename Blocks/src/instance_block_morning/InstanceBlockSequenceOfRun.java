package instance_block_morning;

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
