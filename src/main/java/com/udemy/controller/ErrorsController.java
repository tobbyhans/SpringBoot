package com.udemy.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ErrorsController {
	public static final String INTERNAL_SERVER_ERROR_VIEW="/error/500";
	
	@ExceptionHandler(Exception.class)
	public String ShowInternalServerError(){
		return INTERNAL_SERVER_ERROR_VIEW;
	}

}
