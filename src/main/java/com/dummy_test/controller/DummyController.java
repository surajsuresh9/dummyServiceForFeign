package com.dummy_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dummy")
public class DummyController {

	@GetMapping("/name")
	public String getName() {
		return "Java Player";
	}
	
	@GetMapping("/address")
	public String getAddress() {
		return "India";
	}
	
	@GetMapping("/status")
	public String getStatus() {
		return "Active";
	}
	
}
