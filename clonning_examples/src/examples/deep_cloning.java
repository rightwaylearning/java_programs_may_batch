package examples;

class CityInfo{
	String name;
	int distanceFromCapitalCity;
}

class City implements Cloneable{
	int papulation;
	float temp;
	CityInfo info;	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		City cloneCity = (City)super.clone();
		
						CityInfo info = new CityInfo();
						info.name = cloneCity.info.name;
						info.distanceFromCapitalCity = cloneCity.info.distanceFromCapitalCity;
	                    
						cloneCity.info = info;	
	    
	    
		return cloneCity;
	}
}


public class deep_cloning {

	public static void main(String[] args) throws Exception {
		City  c = new City();
			c.papulation = 234567;
			c.temp = 30.23F;
			c.info = new CityInfo();
		          	c.info.name = "Pune";
		          	c.info.distanceFromCapitalCity = 150;
		          	
	    City clone =(City) c.clone();    
	    
	    c.info.name = "Mumbai";
	    
	    System.out.println(" == original object printing ==");
	    System.out.println(c.papulation);
	    System.out.println(c.temp);
	    System.out.println(c.info.name);
	    System.out.println(c.info.distanceFromCapitalCity);
		
	    
	    System.out.println(" == clobe object printing ==");
	    System.out.println(clone.papulation);
	    System.out.println(clone.temp);
	    System.out.println(clone.info.name);
	    System.out.println(clone.info.distanceFromCapitalCity);
		
	}
}
