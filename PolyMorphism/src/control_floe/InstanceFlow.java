package control_floe;
// instance === object

class Parent1{
	int  aa = 100;  // 1
	{  // 2
		System.out.println("I am Parent first block");
	}
	Parent1(){ // 3
		System.out.println("I am Parent Constructor");
	}
	{  // 4
		System.out.println("i am second parent1 block");
	}
}

public class InstanceFlow extends Parent1 {
 int a = 10;  // 5
 { 
	 System.out.println("i am child class first block");
 }  //6
 InstanceFlow(){  // 7
	 super();
	 System.out.println("child Constructor");
 }
 public static void main(String[] args) {
	 InstanceFlow i = new InstanceFlow();
     
 }
 {
	 System.out.println("i am second block of child class");
 }
 int y = 20;  //9
 
}


// run first parent constuctor
// run own instance block & instance data init