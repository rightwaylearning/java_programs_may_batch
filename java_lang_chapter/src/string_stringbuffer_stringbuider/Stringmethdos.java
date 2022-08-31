package string_stringbuffer_stringbuider;

public class Stringmethdos {

	public static void main(String[] args) {
		
		String s = "abc";
		System.out.println(s.length());
		
		char e = s.charAt(1);
		System.out.println(e);
		System.out.println(">>>>>>>>>>>>>>");
		
		String str = "good Morning"; // 12  idex >> 0 11
		
		for(int i= 0; i< str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(">>>>>>>>>>>>>");
		
		for(int i= (str.length()-1);i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		// -----------------
		
		String str1 = "good morning";
		
		System.out.println(str1.equals("good morning"));
		
		char[] data=str1.toCharArray();		
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		// ====================
		
		String s11 = new String();
		String s12 = new String("abc");
		//======================================
		
		char[] ch = {'s','a','c','h','i','n'};
		
		String name = new String(ch);
		System.out.println(name);
		
		char[] ch1 =name.toCharArray();
		
		System.out.println(ch.length);
		System.out.println(name.length());
		System.out.println(ch1.length);
		
	
		
	}
}
