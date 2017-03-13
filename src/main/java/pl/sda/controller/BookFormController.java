package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.beans.Book;

@Controller
public class BookFormController {

	@RequestMapping(value = "/bookForm", method = RequestMethod.GET)
	public ModelAndView showBookForm() {

		ModelAndView model = new ModelAndView();
		model.addObject("book", new Book());
		model.setViewName("bookForm");

		return model;

	}

	@RequestMapping(value = "/bookForm", method = RequestMethod.POST)
	public ModelAndView saveBookForm(@ModelAttribute Book book) {

		ModelAndView model = new ModelAndView();
		model.setViewName("bookForm");

		model.addObject("bookDetails", book.getName() + " "
				+ book.getAuthor() + " "
				+ book.getYear() + ""
				+ book.isCover());

		return model;

	}

	
}