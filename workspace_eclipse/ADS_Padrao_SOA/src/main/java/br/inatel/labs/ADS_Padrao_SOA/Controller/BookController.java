package br.inatel.labs.ADS_Padrao_SOA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.labs.ADS_Padrao_SOA.model.entity.Book;
import br.inatel.labs.ADS_Padrao_SOA.model.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping
	public List<Book> getAllBooks(){
		List<Book> books = service.searchBook();
		return books;
	}
	
}