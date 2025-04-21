package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpDetails {

	
	@GetMapping("/myapp/{empno}")
	public Employee getDetails(@PathVariable("empno")String empno)
	{
		System.out.println("in getempno-- "+empno);
		return new Employee(empno,"Pav_"+ empno);
		
	}
	
	
}
