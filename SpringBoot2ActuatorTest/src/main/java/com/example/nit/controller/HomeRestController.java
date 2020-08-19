package com.example.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nit.service.HomeService;

@RestController
//@Scope("prototype")
public class HomeRestController {
	
	
	@Autowired
	private HomeService service;

	@GetMapping("show")
	public String hello() {
		return "Welcome:";
	}
}
