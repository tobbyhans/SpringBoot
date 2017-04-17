package com.udemy.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.component.ExampleComponent;

import com.udemy.services.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String EXAMPLE_VIEW = "people";

	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	@Autowired
	@Qualifier("ExampleComponent")
	
	private ExampleComponent exampleComponent ;
	

	// PRIMERA FORMA REDIRECCIONES
	@GetMapping("/exampleString")
		public String exampleString(Model model) {
		exampleComponent.sayhello();
		model.addAttribute("people",exampleService.getListPeople());
		return EXAMPLE_VIEW;

	}

	// SEGUNDA FORMA INSERTAR DATOS
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView name = new ModelAndView(EXAMPLE_VIEW);
		name.addObject("people", exampleService.getListPeople());
		
		return name;

	}


}
