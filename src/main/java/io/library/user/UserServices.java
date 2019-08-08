package io.library.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository urp;

	public User addUser(GetUser getUser) {
		User user = new User();
		if(null == getUser||null==getUser.getUname()||null==getUser.getUpass())
		{
			user.setMessage("Enter mandatory details");
			return user;
		}
		if(null==urp.findByUname(getUser.getUname()))
		{
			user.setUsername(getUser.getUsername());
			user.setDob(getUser.getDob());
			user.setUname(getUser.getUname());
			user.setUpass(getUser.getUpass());
			user.setMessage("User Added");
			return urp.save(user);
			
		}
		user.setMessage("User Id Already exist");
		return user;
			
	}

	public List<User> showAll() {
		return urp.findAll();
	}

}
