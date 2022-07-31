package getClass_method_details;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student {

	public int a;
	public int b;
	
	public void m1() {}
	public void test() {}
	
	public static void main(String[] args) {
		
		  String s1 ="";
		  Class c1 = s1.getClass();
		  System.out.println(c1.getName());
		
		  Student s = new Student();
		  Class c = s.getClass();
		  
		  System.out.println(c.getName());
		    Field[] arr = c.getFields();
		    
		    for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i].getName());
			}
		    
		   Method[] m =  c.getMethods();
		   
		   for (int i = 0; i < m.length; i++) {
		       System.out.println(m[i].getName());
		   
		   }
			 
		   
	}
}
