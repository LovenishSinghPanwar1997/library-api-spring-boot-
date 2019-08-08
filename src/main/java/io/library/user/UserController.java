package io.library.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/library/user")
public class UserController {
	
	@Autowired
	private UserServices us;
	
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public User addUser(@RequestBody GetUser getUser)
	{
		return us.addUser(getUser);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/showAll")
	public List<User> showAll(){
		return us.showAll();
	}

}
