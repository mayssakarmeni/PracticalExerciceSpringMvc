package org.polytec.vermeg.controller;

import java.util.List;

import org.polytec.vermeg.model.Book;
import org.polytec.vermeg.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class bookController {
	@Autowired
	bookService bookService;
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET, produces = "application/json")
    public String sayHello(){
        return "hello ";
    }
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public List<Book> getbooks() {
		
		List<Book> listOfbooks = bookService.getAllbooks();
		
		return listOfbooks;
	}
	
	
	@RequestMapping(value = "/getbook/{idBook}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Book getbookById(@PathVariable Long idBook) {
		return bookService.getbook(idBook);
	}

	@RequestMapping(value = "/addbook", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addbook(@ModelAttribute("book") Book book) {	
		if(book.getIdBook()==0)
		{
			bookService.addbook(book);
		}
		else
		{	
			bookService.updatebook(book);
		}
		
		return "redirect:/getAllbooks";
	}

	@RequestMapping(value = "/updatebook/{idBook}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public String updatebook(@PathVariable("idBook") Long idBook,Book book) {
		bookService.updatebook(book);
	        return "redirect:/getAllbooks";
	}

	@RequestMapping(value = "/deletebook/{idBook}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public String deletebook(@PathVariable("idBook") Long idBook) {
		bookService.deletebook(idBook);
		     return "redirect:/getAllbooks";

	}	
}
