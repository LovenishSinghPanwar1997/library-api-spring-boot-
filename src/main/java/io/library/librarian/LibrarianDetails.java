package io.library.librarian;

public class LibrarianDetails {
	private Integer libid;
	private String libname;
	private String dob;
	
	public LibrarianDetails() {
		
	}
	
	public LibrarianDetails(Integer libid, String libname, String dob) {
		super();
		this.libid = libid;
		this.libname = libname;
		this.dob = dob;
	}
	public Integer getLibid() {
		return libid;
	}
	public void setLibid(Integer libid) {
		this.libid = libid;
	}
	public String getLibname() {
		return libname;
	}
	public void setLibname(String libname) {
		this.libname = libname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
