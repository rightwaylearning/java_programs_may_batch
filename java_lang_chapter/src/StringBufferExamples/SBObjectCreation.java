package StringBufferExamples;

public class SBObjectCreation {

	public static void main(String[] args) {

		StringBuffer br = new StringBuffer(); // 16
		// = (old capacity + 1)*2 = 34
		br.append("abc");
		br.append("lmn");
		System.out.println(br);
		
		System.out.println(br.capacity());
		System.out.println(br.length());
		System.out.println("================");
		br.append("artyhgruio");
		System.out.println(br.capacity());
		br.append("H");
		System.out.println(br.capacity());
		System.out.println("========================");
		
		StringBuffer br1 =new StringBuffer(10);
		System.out.println(br1.capacity());
		br1.append("12345678901");
		System.out.println(br1.capacity());
		
		//============================
		String str = "abcpqrlmn";
		StringBuffer br2= new StringBuffer(str);
		// str.length() + 16 = 25
		System.out.println(br2.capacity());
		
		//=============================
		// 1] length();
		// 2] capacity()
		// 3] append(String str)
		 // 4] charAt
		
		System.out.println(br2.charAt(1));//
		   // 5] setCharAt(0,'i')
		//=======================
		String name = "india.";
		StringBuffer br4 = new StringBuffer(name);
		br4.setCharAt(0, 'I');
		System.out.println(br4);
		
	     // 6] deleteCharAt(4)
		br4.deleteCharAt(5);
		System.out.println(br4);
		
		
		StringBuffer br5 = new StringBuffer("hello how are u");
		       br5.reverse();
		          System.out.println(br5);
		          
		 String str2 = "Hello good moring";   
		 StringBuffer br7 = new StringBuffer(str2);
		 br7.reverse();
		 str2 = new String(br7);
		 System.out.println(str2);
		
		
		
		//String s3 =  ;
//		 String s1 = s.toUpperCase();
//		 String s2 = s1.trim();
//		 String s3 = s2.concat("LMN");
		 System.out.println("abc  ".toUpperCase().trim().concat("LMN"));
		

	}
}
