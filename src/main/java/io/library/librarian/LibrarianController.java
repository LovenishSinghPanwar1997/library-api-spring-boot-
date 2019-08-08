package io.library.librarian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/library/librarian")
public class LibrarianController {
	
	@Autowired
	LibrarianServices ls;
	
	@RequestMapping(method = RequestMethod.GET , value = "/getAll")
	public List<LibrarianDetails> getalllib() {
		return ls.getalllibrarian();
		
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/get/{id}")
	public LibrarianDetails getlib(@PathVariable int id) {
		return ls.getsinglelib(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/add")
	public Librarian addlib(@RequestBody GetLibrarian lib) {
		return ls.addnewlib(lib);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/login")
	public String login(@RequestBody LibrarianLogin liblogin) {
		return ls.loginlib(liblogin);
		
	}

}
