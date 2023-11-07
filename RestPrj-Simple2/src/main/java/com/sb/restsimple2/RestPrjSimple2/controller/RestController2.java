package com.sb.restsimple2.RestPrjSimple2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api2")
public class RestController2 {
	
	@GetMapping("/welcome2/{name}")
	public String getMessage(@PathVariable String name) {
		String sayHi = "Hi "+name;
		System.out.println(sayHi);
		return sayHi;
	}

}
