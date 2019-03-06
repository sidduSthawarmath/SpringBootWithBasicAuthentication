package com.siddu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmployeeController {

	
	@RequestMapping(value="empNameByid")
	public String getEmpNameById(@RequestParam("id") String id)
	{
		return "Siddu";
	}
	
}
