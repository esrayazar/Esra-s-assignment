package com.assignments.ninjagold.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
@GetMapping("/")
public String gold() {
	return "gold.jsp";
}
@PostMapping("/findGold")
public String findGold() {
	return  null;
}

}
