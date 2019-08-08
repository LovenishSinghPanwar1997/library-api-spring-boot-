package io.library.user;

public class GetUser {
	private String username;
	private String dob;
	private String uname;
	private String upass;
	
	public GetUser() {
		
	}
	
	public GetUser(String username, String dob, String uname, String upass) {
		super();
		this.username = username;
		this.dob = dob;
		this.uname = uname;
		this.upass = upass;
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
