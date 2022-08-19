package methods_of_wrapper_classes;

public class UtilityMethods {

	public static void main(String[] args) {
		int a = 10;
		
		// from primitive to wrapper class object 
		Integer obj = Integer.valueOf(a);
		
		// from primitive to String object
		String strObj= Integer.toString(a);
		
		// wrapper class object to primitive
		int retValue = obj.intValue();
		
		// from strong object to primitive
		int retPri =  Integer.parseInt(strObj);
		
		Integer obj1 = Integer.valueOf("10");
		
		String str =  obj1.toString();
	}
}
