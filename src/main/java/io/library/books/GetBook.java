package io.library.books;

public class GetBook {
	
	private String bookname;
	private String bookauthor;
	private Integer bookcount;
	
	public GetBook() {
		
	}
	
	public GetBook(String bookname, String bookauthor, Integer bookcount) {
		super();
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookcount = bookcount;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public Integer getBookcount() {
		return bookcount;
	}

	public void setBookcount(Integer bookcount) {
		this.bookcount = bookcount;
	}

	

}
