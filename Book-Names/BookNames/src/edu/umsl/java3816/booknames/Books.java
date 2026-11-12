package edu.umsl.java3816.booknames;

public class Books  {
	static Books bks = new Books();//declares reference to books object
    String bookName = "book name";
    String bookAuthorName = "book author name";
    String bookGenre = "book genre";
    
	static Book1 bk1 = new Book1();//declared different book object to store in an array
	static Book2 bk2 = new Book2();//declared different book object to store in an array
	static Book3 bk3 = new Book3();//declared different book object to store in an array
	
	public Books getBks() {
		return bks;
	}
	public void setBks(Books bks) {
		Books.bks = bks;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthorName() {
		return bookAuthorName;
	}
	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public Book1 getBk1() {
		return bk1;
	}
	public void setBk1(Book1 bk1) {
		Books.bk1 = bk1; 
	}
	public Book2 getBk2() {
		return bk2;
	}
	public void setBk2(Book2 bk2) {
		Books.bk2 = bk2;
	}
	public Book3 getBk3() {
		return bk3;
	}
	public void setBk3(Book3 bk3) {
		Books.bk3 = bk3;
	}
	public void Books() {
		System.out.println("Books contain the following information: ");
		System.out.println(bookName);
		System.out.println(bookAuthorName);
		System.out.println(bookGenre);
	}
}