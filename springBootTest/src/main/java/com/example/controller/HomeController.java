package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

@Controller
public class HomeController {

			private String name;
	@RequestMapping("/hello")
	public String hello() 
	
	{
return "welcome";

	}
}
