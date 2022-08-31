package StringExample;

public class StringComp {

	public static void main(String[] args) {
		
		String s = new String("abc");
		s = s.concat("pqr");
		String m = "abcpqr";
		
		System.out.println(s == m);
		System.out.println(s.equals(m));
		System.out.println(s.hashCode() == m.hashCode());
		
		
		String b = new String("RightWayLearning");
		String c = "Right";
		String d = "Way";
		String e = "Learning";
		String f = c + d + e;
		
		String g = "RightWayLearning";
		
		System.out.println(b==g);
		System.out.println(b==f);
		
		
		
		
		
	}
}
