package introduction;

public class ObjectClassMethdos {

	public static void main(String[] args) {
		ObjectClassMethdos obj = new ObjectClassMethdos();
		
		obj.toString();  // String
//		obj.clone();  // Object
		obj.hashCode(); // int
//		obj.equals(Object obj) // booelan
//		obj.finalize(); // void
		obj.getClass(); // Class
		
		// multithreading chapter
		obj.notify();
		obj.notifyAll();
//		obj.wait();
//		obj.wait(100);
//		obj.wait(100,200);
		
		
	    	
	}
}