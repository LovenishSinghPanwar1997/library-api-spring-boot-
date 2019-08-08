package io.library.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {
	
	@Autowired
	BookRepository br;
	
	
	public List<Book> showallbooks() {
		return br.findAll();
		
	}


	public Book getBookByName(String name) {
		Book t = new Book();
		t = br.findByBookname(name);
		return t;
	}


	public Book addBook(GetBook book) {
//		System.out.println(book.getBookauthor()+" "+book.getBookname()+" "+book.getBookcount());
		Book t = new Book();
		t.setBookname(book.getBookname());
		t.setBookauthor(book.getBookauthor());
		t.setBookcount(book.getBookcount());
//		System.out.println(t.getBookid()+" "+t.getBookname()+" "+t.getBookauthor()+" "+t.getBookcount());

		return br.save(t);
	}


}
