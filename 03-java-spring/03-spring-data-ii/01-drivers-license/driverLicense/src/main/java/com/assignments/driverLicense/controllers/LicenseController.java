package com.assignments.driverLicense.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.driverLicense.models.License;
import com.assignments.driverLicense.service.PersonAndlicenseService;

@Controller
public class LicenseController {
	
	@Autowired
	private PersonAndlicenseService  licenseService;
	
	@GetMapping("/licenses/new")
    public String getLicense() {
        return "license.jsp";
    }
  @PostMapping("/licenses/new")
    public String createLicense(License license) {
        licenseService.saveLicense(license);
        return "redirect:/licenses/new";
    }


}
