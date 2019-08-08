package io.library.books;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.library.books.bookissuehistory.BookIssue;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookid")
	private Integer bookid;
	@Column(name = "bookname")
	private String bookname;
	@Column(name = "bookauthor")
	private String bookauthor;
	@Column(name = "bookcount")
	private Integer bookcount;

    @JsonManagedReference(value="book_history")
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<BookIssue> bookIssueList=new ArrayList<>();
	
	

	public List<BookIssue> getBookIssueList() {
		return bookIssueList;
	}

	public void setBookIssueList(List<BookIssue> bookIssueList) {
		this.bookIssueList = bookIssueList;
	}

	public Book() {

	}

	

	public Book(Integer bookid, String bookname, String bookauthor, Integer bookcount, List<BookIssue> bookIssueList) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookcount = bookcount;
		this.bookIssueList = bookIssueList;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
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
