package org.polytec.vermeg.service;


import java.util.List;
import org.polytec.vermeg.dao.IbookDAO;
import org.polytec.vermeg.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bookService")
public class bookService {
	@Autowired
	IbookDAO ibook;
	@Transactional
	public List<Book> getAllbooks() {
		return ibook.getAll();
	}

	@Transactional
	public Book getbook(Long idBook) {
		return ibook.getbookByID(idBook);
	}

	@Transactional
	public void addbook(Book book) {
		ibook.addbook(book);
	}

	@Transactional
	public void updatebook(Book book) {
		ibook.updatebook(book);

	}

	@Transactional
	public void deletebook(Long id) {
		ibook.deletebook(id);
	}

	
}
