package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Example2")
public class Example2controlller {

	private static final String EXAMPLE2_VIEW = "example2";
	// http://localhost:8080/Example2/request1?nm=carolina
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name = "nm", required = false, defaultValue = "null") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;

	}
	// http://localhost:8080/Example2/request1/carolina
	@RequestMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm")String name ){
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
		
	}
	

}
