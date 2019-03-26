package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Student;

@Controller
public class EmployeeController {
 //1.show Register jsp Page
	@RequestMapping("/show")
	public String showPage() {
		return "StdReg";
		
	}
 //2.On Click submit read from data
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String readData(@ModelAttribute("student")Student std,
			ModelMap map) {
		map.addAttribute("std",std);
		return "StdData";
	}
}
