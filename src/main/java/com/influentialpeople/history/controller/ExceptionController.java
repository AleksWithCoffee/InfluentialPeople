package com.influentialpeople.history.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class ExceptionController {
	
	@RequestMapping(value = "/exception")
	@ExceptionHandler(Exception.class)
	public String handleException() {

		return "exception";
	}
}
