package combine;

public class BookController {

	public static void main(String[] args) {
		Book b = new Book("A",12300,"B");
		Book b1 = new Book("A",12301,"B");
		
		System.out.println(b1.equals(b)); // ==
		
		String s1 = new String("ABC");
		
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2)); // 
		
	}
}
