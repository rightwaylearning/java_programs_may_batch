package test;

public class Test implements Cloneable{
	int num;
	int num1;

	public static void main(String[] args) {
		Test t = new Test();
		t.num = 100;
		t.num1 = 200;
         try {
		Test t1 = (Test) t.clone();
		System.out.println(t1.num);
         }catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
