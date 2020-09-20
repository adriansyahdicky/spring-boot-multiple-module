package com.dicky.elmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dicky.elmo.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String>{

}

