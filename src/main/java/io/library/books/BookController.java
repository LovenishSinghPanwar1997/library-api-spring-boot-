package io.library.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/library/book")
public class BookController {
	
	@Autowired
	BookServices bs;
	
	@RequestMapping(method = RequestMethod.GET , value = "/showAll")
	public List<Book> showallbooks()
	{
		return bs.showallbooks();
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/getByName/{name}")
	public Book getBookByName(@PathVariable String name) {
		return bs.getBookByName(name);
		
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/add")
	public Book addBook(@RequestBody GetBook book) {
		return bs.addBook(book);
	}

}
