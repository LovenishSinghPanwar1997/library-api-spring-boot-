package io.library.books.bookissuehistory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.library.books.Book;
import io.library.user.User;

@Entity(name="BOOK_ISSUE")
@JsonIgnoreProperties("inspection")
public class BookIssue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOOK_ISSUE_ID")
	private Integer bookIssueId;
	@Column(name="BOOK_ID")
	private Integer bookId;
	@Column(name="USER_ID")
	private Integer userId;

	@JsonBackReference(value = "book_history")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book")
	private Book book;
	
	@JsonBackReference(value="user_history")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user")
	private User user;
	
	@Transient
	private String message;
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getBookIssueId() {
		return bookIssueId;
	}

	public void setBookIssueId(Integer bookIssueId) {
		this.bookIssueId = bookIssueId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookIssue(Integer bookIssueId, Integer bookId, Integer userId, Book book,User user) {
		super();
		this.bookIssueId = bookIssueId;
		this.bookId = bookId;
		this.userId = userId;
		this.book = book;
		this.user = user;
	}
	
	public BookIssue() {
		
	}
	
}
