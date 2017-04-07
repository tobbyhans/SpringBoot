package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String EXAMPLE_VIEW = "example";

	// PRIMERA FORMA REDIRECCIONES
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("person", new Person("jon", 24));
		return EXAMPLE_VIEW;

	}

	// SEGUNDA FORMA INSERTAR DATOS
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView name = new ModelAndView(EXAMPLE_VIEW);
		name.addObject("person", new Person("mikel", 29));
		// return new ModelAndView(EXAMPLE_VIEW);
		return name;

	}
}
