package instance_block_morning;

public class TestFlow {
    int a;
    static int b;
    {
    	this.a = 1;
    	TestFlow.b = 2;
    }
    static {
    	TestFlow.b = 4;
    }
    TestFlow(){
    	System.out.println(this.a);  // 45
    	System.out.println(TestFlow.b);  //67
    	this.a =10;
    	TestFlow.b =20;
    }
    public static void main(String[] args) {
    	TestFlow t = new TestFlow();
    	System.out.println(t.a); // 10
    	System.out.println(TestFlow.b); // 20
	}
    {
    	this.a = 45;
    	TestFlow.b = 67;
    }
    static {
    	TestFlow.b = 100;
    }
}
