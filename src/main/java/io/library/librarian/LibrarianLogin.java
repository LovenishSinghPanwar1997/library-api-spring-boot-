package io.library.librarian;

public class LibrarianLogin {
	private String libuname;
	private String libupass;
	
	public LibrarianLogin() {
		
	}
	
	public LibrarianLogin(String libuname, String libupass) {
		super();
		this.libuname = libuname;
		this.libupass = libupass;
	}

	public String getLibuname() {
		return libuname;
	}

	public void setLibuname(String libuname) {
		this.libuname = libuname;
	}

	public String getLibupass() {
		return libupass;
	}

	public void setLibupass(String libupass) {
		this.libupass = libupass;
	}
}
