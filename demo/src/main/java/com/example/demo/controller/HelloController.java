package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping(value = "*", method = RequestMethod.GET)
	public String hello() {
		return "Hello Spring";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String doIndex() {
		return "This is the main page";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		return "This is the contact page";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloParams(@RequestParam(name = "lokaatio") String location,
			@RequestParam(name = "nimi") String nimi) {
		return "Welcome to the " + location + " " + nimi;
	}

}