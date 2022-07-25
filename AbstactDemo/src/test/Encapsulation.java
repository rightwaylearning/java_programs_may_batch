package test;

public class Encapsulation {
	private String name;
	private int rollNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() > 0) {
			this.name = name;
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
	//	if we make public  property then any one can assign any type value
		// but if we make private property & for data assignment if we use setter method
		// the u can use filter here to avoid wrong number assignment to data
		if(this.rollNumber > -1) {
			this.rollNumber = rollNumber;
		}
			
	}

}
