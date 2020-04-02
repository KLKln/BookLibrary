package booklibraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import booklibraryapp.repository.BookRepository;
import booklibraryapp.beans.Book;

@Controller
public class WebController {
	@Autowired
	BookRepository repo;
	
	@GetMapping({ "/", "viewAll"})
	public String viewAllBooks(Model model) {
		if(repo.findAll().isEmpty()) {
			return viewAllBooks(model);
		}
		
		model.addAttribute("books", repo.findAll());
		return "library";
	}
	
	@GetMapping("/addNewBook")
	public String addNewBook(Model model) {
		Book b = new Book();
		model.addAttribute("newBook", b);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateBook(@PathVariable("id")long id, Model model) {
		Book b = repo.findById(id).orElse(null);
		System.out.println("BOOK TO EDIT: " + b.toString());
		model.addAttribute("newBook", b);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseContact(Book b, Model model) {
		repo.save(b);
		return viewAllBooks(model);
	}
	
	@GetMapping("/remove/{id}")
	public String removeBook(@PathVariable("id") long id, Model model) {
		Book b = repo.findById(id).orElse(null);
	    repo.delete(b);
	    return viewAllBooks(model);
	}

}
