package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello/{username:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("username") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public ModelAndView helloOtherParam(@RequestParam("name") String name,
										@RequestParam("surname") String surname) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("test1", name);
		model.addObject("test2", surname);

		return model;

	}


}