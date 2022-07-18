package instance_block_morning;

public class DataInitInsideBlock {
    int a;
    static int b;
    
    static{
    
    	b = 20;
    }
    {
    	a = 100;
    	b = 200;
    }
    DataInitInsideBlock(){
    	a = 67;
    	b = 89;
    }
    public static void main(String[] args) {
		DataInitInsideBlock o = new DataInitInsideBlock();
		System.out.println(b);
		System.out.println(o.a);
	}
}
