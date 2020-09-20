package com.dicky.elmo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dicky.elmo.model.Department;
import com.dicky.elmo.service.DepartmentService;

@RestController
@RequestMapping(value = "/api/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping(value = "/getDepartments")
	public List<Department> getDepartments(){
		return departmentService.getDepartments();
	}
	
}
