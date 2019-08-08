package io.library.librarian;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrarianServices {
	
	@Autowired
	LibrarianRepository lb;

	public List<LibrarianDetails> getalllibrarian() {
		List<Librarian> t = new ArrayList<>();
		t = lb.findAll();
		List<LibrarianDetails> f = new ArrayList<>();
		for(int i=0;i<t.size();i++)
		{
			LibrarianDetails objdata = new LibrarianDetails() ;
			Librarian temp;
			temp = t.get(i);
			objdata.setLibid(temp.getLibid());
			objdata.setLibname(temp.getLibname());
			objdata.setDob(temp.getDob());
			f.add(i, objdata);
		}
		return f;
		
	}

	public LibrarianDetails getsinglelib(Integer id ) {
		Librarian t = lb.findById(id).get();
		LibrarianDetails f = new LibrarianDetails();
		f.setLibid(t.getLibid());
		f.setLibname(t.getLibname());
		f.setDob(t.getDob());
		return f;
	}

	public Librarian addnewlib(GetLibrarian lib) {
		Librarian t = new Librarian();
		t.setLibname(lib.getLibname());
		t.setDob(lib.getDob());
		t.setLibuname(lib.getLibuname());
		t.setLibpass(lib.getLibpass());
		return lb.save(t);
	}

	public String loginlib(LibrarianLogin liblogin) {
		System.out.println(liblogin.getLibuname()+" "+liblogin.getLibupass());
		Librarian t = lb.findByLibuname(liblogin.getLibuname());
		System.out.println(t.getLibid());
		System.out.println(t.getLibuname()+" "+t.getLibpass());
		if(liblogin.getLibupass().equals(t.getLibpass()))
			return "Successfully loged in";
		return "User Not Availabel";
	}

}
