package methodoveloading;

 class PramotionOfPrimitiveTypeParameter {

	
	 void sum(double d1, double d2) {
		 System.out.println("double, double parameters");
	 }
	 void sum(int a, int b) {
		 System.out.println("int, int parameters");
	 }
	 
	 void sum(byte a, int b) {
		 System.out.println("byte, int parameters");
	 }
	 
	 public static void main(String[] args) {
		 PramotionOfPrimitiveTypeParameter
		   p = new PramotionOfPrimitiveTypeParameter();
		 
		 p.sum(10.6F, 10L);
		 byte b = 10;
		 p.sum(b, 10);
	}
}
