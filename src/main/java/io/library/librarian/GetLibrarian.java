package io.library.librarian;

public class GetLibrarian {
	private String libname;
	private String dob;
	private String libuname;
	private String libpass;
	
	public GetLibrarian() {
		
	}
	
	public GetLibrarian(String libname, String dob, String libuname, String libpass) {
		super();
		this.libname = libname;
		this.dob = dob;
		this.libuname = libuname;
		this.libpass = libpass;
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
