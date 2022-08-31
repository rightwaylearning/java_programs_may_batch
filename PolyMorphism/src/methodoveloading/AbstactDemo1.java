package methodoveloading;

abstract class M{
	abstract void m1();
}

class N extends M{
	void m1(){
		
	}
}


class G {
	void m1(){
		
	}
}

abstract class F extends G{
	abstract void m1();
}

class S extends F{
	@Override
	void m1() {
            		
	}
}




















public class AbstactDemo1 {

}
