package com.udemy.controller;

import static org.assertj.core.api.Assertions.setAllowComparingPrivateFields;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String EXAMPLE_VIEW = "people";

	// PRIMERA FORMA REDIRECCIONES
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("people",getPeople());
		return EXAMPLE_VIEW;

	}

	// SEGUNDA FORMA INSERTAR DATOS
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView name = new ModelAndView(EXAMPLE_VIEW);
		name.addObject("people", getPeople());
		
		return name;

	}

	private List<Person> getPeople() {
	      List<Person> people = new ArrayList<>();
	        people.add(new Person("Carlos",20));
	        people.add(new Person("juan",50));
	        people.add(new Person("Carlos",20));
	        people.add(new Person("juan",50));
	        return people;
	        
}

}
