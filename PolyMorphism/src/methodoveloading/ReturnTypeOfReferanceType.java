package methodoveloading;

class A{}
class B extends A {}
class C extends B{}

class Parent{
	public Number getNum(int a) {
		return 0;
	}
	
	public A getObject() {
		return null;
	}
}

class Child extends Parent{
	
	@Override
	public Integer getNum(int a) {
		return null;
	}
	
	@Override
	public C getObject() {
		return null;
	}
}


public class ReturnTypeOfReferanceType {

}
