package io.library.librarian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="librarian")
public class Librarian {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="libid")
	private Integer libid;
	@Column(name="libname")
	private String libname;
	@Column(name="dob")
	private String dob;
	@Column(name="libuname")
	private String libuname;
	@Column(name="libpass")
	private String libpass;
	
	public Librarian()
	{
		
	}
	
	public Librarian(Integer libid, String libname, String dob, String libuname, String libpass) {
		super();
		this.libid = libid;
		this.libname = libname;
		this.dob = dob;
		this.libuname = libuname;
		this.libpass = libpass;
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

	public String getLibuname() {
		return libuname;
	}

	public void setLibuname(String libuname) {
		this.libuname = libuname;
	}

	public String getLibpass() {
		return libpass;
	}

	public void setLibpass(String libpass) {
		this.libpass = libpass;
	}
	
	

}
