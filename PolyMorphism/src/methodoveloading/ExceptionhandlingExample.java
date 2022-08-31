package methodoveloading;

import java.sql.SQLClientInfoException;

abstract class PP{
	
	abstract void m1() throws Exception;
}

class CC extends PP{
	
	@Override
	void m1() throws SQLClientInfoException{
	
	}
}


public class ExceptionhandlingExample {

	public static void main(String[] args) {
		
	}
}
