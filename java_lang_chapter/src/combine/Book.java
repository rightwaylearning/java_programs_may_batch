package combine;

public class Book {

	private String bookName;
	private int pageCount;
	private String bookWritten;

	public Book() {
	}

	public Book(String bookName, int pageCount, String bookWritten) {
		super();
		this.bookName = bookName;
		this.pageCount = pageCount;
		this.bookWritten = bookWritten;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}else {
		
			if(obj instanceof Book) {
				Book b = (Book)obj;
				return b.pageCount == this.pageCount;
			}else {
				return false;
			}
		}
		
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getBookWritten() {
		return bookWritten;
	}

	public void setBookWritten(String bookWritten) {
		this.bookWritten = bookWritten;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", pageCount=" + pageCount + ", bookWritten=" + bookWritten + "]";
	}

	
}
