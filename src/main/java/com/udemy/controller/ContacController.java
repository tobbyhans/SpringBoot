package com.udemy.controller;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.constant.ViewConstant;
import com.udemy.model.ContactModel;

@Controller
@RequestMapping("/contacts")
public class ContacController {
	
	private static final Log LOG =  LogFactory.getLog(ContacController.class);
	
	@GetMapping("/cancel")
	public String cancel() {
		return ViewConstant.CONTACTS;
	}

	@GetMapping("/contacform")
	private String redirectContactForm(Model model) {
		model.addAttribute("contactModel", new ContactModel());
		return ViewConstant.CONTACT_FORM;

	}
	@PostMapping("/addcontact")
	public String addContact(@ModelAttribute("name=contactModel") ContactModel contactModel){
		  LOG.info("METHOD : addContact() -- PARAMS : " + contactModel.toString());
		return ViewConstant.CONTACTS;
	}

}
