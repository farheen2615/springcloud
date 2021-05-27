package com.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.ConfigProps;

@RestController
public class MyController {
	@Autowired
	ConfigProps configProps;

	@RequestMapping("/displayProperties")
	public String displayProperties() {
		return "Username :" + configProps.getUsername() + "Password :" + configProps.getPassword() + "No of Attempts :"
				+ configProps.getAttempt();
	}
}
