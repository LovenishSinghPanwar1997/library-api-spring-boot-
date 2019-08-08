package io.library.books.bookissuehistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.library.books.BookRepository;
import io.library.user.UserRepository;

@Service
public class BookIssueService {
	
	@Autowired
	private BookIssueRepository brp;
	@Autowired
	private BookRepository bookrep;
	
	@Autowired
	private UserRepository userrep;
	
	public BookIssue add(BookIssue bookissue) {
		BookIssue bookissuet = new BookIssue();
		if(null==bookissue.getBookId() || null == bookissue.getUserId())
		{
			bookissuet.setMessage("UserId or BookId not available.. Create One or correct it");
			return bookissuet;
		}
		if(null != brp.findByUserId(bookissue.getUserId()))
		{
			List<BookIssue> t = brp.findByUserId(bookissue.getUserId());
			for(int i=0;i<t.size();i++)
			{
				BookIssue b = t.get(i);
				if(bookissue.getBookId().equals(b.getBookId()))
				{
					BookIssue temp = new BookIssue();
					temp.setMessage("Same book already issued");
				}
			}
		}
		int bookid = bookissue.getBookId();
		bookissue.setBook(bookrep.findById(bookid).get());
		int userid = bookissue.getUserId();
		bookissue.setUser(userrep.findById(userid).get());
		return brp.save(bookissue);
	}
	
	

}
