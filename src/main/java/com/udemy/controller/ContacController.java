package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.constant.ViewConstant;

@Controller
@RequestMapping("/contacts")
public class ContacController {

	@GetMapping("/contacform")
	private String redirectContactForm() {
		return ViewConstant.CONTACT_FORM;

	}

}
