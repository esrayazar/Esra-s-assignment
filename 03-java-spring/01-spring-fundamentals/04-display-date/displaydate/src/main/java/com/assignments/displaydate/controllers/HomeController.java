package com.assignments.displaydate.controllers;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/date")
	public String dateEndPoint(Model model) {
		java.util.Date myDate= new java.util.Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(myDate);
		
		String result = "";
		int year = calendar.get(Calendar.YEAR);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String month = new SimpleDateFormat("MMMM").format(myDate);
		String dayOfWeek = new SimpleDateFormat("EEEE").format(myDate);
		result= dayOfWeek + ", the "+ day + " of "+ month +", "+ year;
		
		model.addAttribute("date",result);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String timeEndPoint(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
		java.util.Date myDate= new java.util.Date();
		String timeString = dateFormat.format(myDate);
		model.addAttribute("time", timeString);
		return "time.jsp";
	}
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	

}
