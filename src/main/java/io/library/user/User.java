package io.library.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.library.books.bookissuehistory.BookIssue;

@Entity(name="USER_DETAILS")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	private Integer userid;
	@Column(name="USERNAME")
	private String username;
	@Column(name="DOB")
	private String dob;
	@Column(name="LOGIN_ID")
	private String uname;
	@Column(name="LOGIN_PASSWORD")
	private String upass;
	
	@Transient
	private String message;
	
    @JsonManagedReference(value="user_history")
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<BookIssue> bookIssueHistory = new ArrayList<>();
	
	public List<BookIssue> getBookIssueHistory() {
		return bookIssueHistory;
	}

	public void setBookIssueHistory(List<BookIssue> bookIssueHistory) {
		this.bookIssueHistory = bookIssueHistory;
	}

	public User() {
		
	}
	
	public User(Integer userid, String username, String dob, String uname, String upass, String message,
			List<BookIssue> bookIssueHistory) {
		super();
		this.userid = userid;
		this.username = username;
		this.dob = dob;
		this.uname = uname;
		this.upass = upass;
		this.message = message;
		this.bookIssueHistory = bookIssueHistory;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	

}
