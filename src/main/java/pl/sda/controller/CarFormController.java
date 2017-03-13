package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarFormController {

	@RequestMapping(value = "/carForm", method = RequestMethod.GET)
	public ModelAndView showCarForm() {

		ModelAndView model = new ModelAndView();
		model.setViewName("carForm");

		return model;

	}

	@RequestMapping(value = "/carForm", method = RequestMethod.POST)
	public ModelAndView saveCarForm(@RequestParam String name,
									@RequestParam String registration,
									@RequestParam String year) {

		ModelAndView model = new ModelAndView();
		model.setViewName("carForm");

		model.addObject("carDetails", name + " " + registration + " " + year);

		return model;

	}

	
}