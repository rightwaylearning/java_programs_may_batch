package instance_block_morning;

public class ScopeExample {
     int a;
     int c;
     static int b;
     
     {
    	 this.a = 100;
    	 ScopeExample.b = 200;
     }
     
     static {
    	 ScopeExample.b = 400;
     }
     
     ScopeExample(){
    	 System.out.println(this.a);
    	 System.out.println(ScopeExample.b);
     }
     public static void main(String[] args) {
    	 new ScopeExample();
	}
}
