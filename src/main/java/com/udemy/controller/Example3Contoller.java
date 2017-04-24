package com.udemy.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Contoller {
	
	//LOG
	private static final Log LOG = LogFactory.getLog(Example3Contoller.class);

	public static final String FORM_VIEW = "form";
	public static final String RESUL_VIEW = "result";

//	// # REDIRECT FORMA 1
//	 @GetMapping("/")
//	 public String redirect(){
//	return "redirect:/example3/showform";	 
//	 }

	// # REDIRECT FORMA 2 ESTO ESPERA COMO UNA URL

	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("http:/example3/showform");
	}

	@GetMapping("/showform")
	public String showForm(Model model) {
		LOG.info("INFO TRACE");
		LOG.warn("WARNIG TRACE");
		LOG.error("ERROR TRACE");
		LOG.debug("DEBUG TRACE");
		model.addAttribute("person", new Person());
		
		return FORM_VIEW;

	}

	@PostMapping("/addperson")
	public ModelAndView addPerson(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult) {
		LOG.info("METHOD : 'addperson' -- PARAMS: '" + person + "' ");
		ModelAndView mav = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			mav.setViewName(FORM_VIEW);
		}else{
			mav.setViewName(RESUL_VIEW);
		mav.addObject("person", person);
		LOG.info("TEMPLATE:'" + RESUL_VIEW + " ' --DATA: '" + person + "'");
		
	}
		return mav;
}
}