package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.product.entity.Employee;
import com.cts.product.service.EmployeeService;

@Controller
public class ProductController {

	
	@Autowired
	private EmployeeService es;
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	
	
	// load employee dform 
	
	@RequestMapping("loadForm")
	public String loadForm() {
		return "employeeform";
	}
	

	
	@RequestMapping("saveEmployee")
	public void saveEmployee(@ModelAttribute Employee emp) {
		
		
	
		es.saveEmployee(emp);
		
		
	}
	
	
	
	
	
}
