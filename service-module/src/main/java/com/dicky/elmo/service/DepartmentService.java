package com.dicky.elmo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dicky.elmo.model.Department;
import com.dicky.elmo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getDepartments(){
		return departmentRepository.findAll();
	}
	
}
