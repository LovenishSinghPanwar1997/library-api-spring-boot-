package io.library.books.bookissuehistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookIssueRepository extends JpaRepository<BookIssue,Integer> {

	public List<BookIssue> findByBookId(Integer bookid);
	public List<BookIssue> findByUserId(Integer userid);
}
