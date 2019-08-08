package io.library.books.bookissuehistory;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/library/bookIssue",consumes = "application/json", produces = "application/json")
public class BookIssueController {
	
	@Autowired
	private BookIssueService bis;
	
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public BookIssue add(@RequestBody BookIssue bookissue)
	{
		return bis.add(bookissue);
		
	}

}
