package com.esra.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.esra.projects.services.ProjectService;
import com.esra.projects.services.StudentService;

@Controller
public class HomeController {
	@Autowired
	private StudentService sService;
	@Autowired
	private ProjectService pService;

}
