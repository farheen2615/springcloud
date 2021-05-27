package com.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.ConfigProps;

@RestController
public class ProjectController {
	@Autowired
	ConfigProps configProps;

	@RequestMapping("/projectProperties")
	public String projectDetails() {
		return "Project Id is :" + configProps.getProjectId() + "Project Name is :" + configProps.getProjectName() + "Project Location is :"
				+ configProps.getProjectLocation() + "Project Cost is: "+ configProps.getProjectCost() + "Project Status is: "+ configProps.getProjectStatus();
	}
}
