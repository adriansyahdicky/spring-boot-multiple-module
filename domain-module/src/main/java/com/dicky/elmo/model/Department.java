package com.dicky.elmo.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dept_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable{

	 	/**
	 * 
	 */
		private static final long serialVersionUID = 1L;

		@Id
	    @Column(name = "dept_id", nullable = false)
	    private UUID deptId;

	    @Column(name = "dept_code", nullable = false)
	    private String deptCode;

	    @Column(name = "dept_desc", nullable = false)
	    private String deptDesc;

	    @Column(name = "dept_template", nullable = false)
	    private String deptTemplate;

	    @Column(name = "status", nullable = false)
	    private String status;

	    @Column(name = "created_at", nullable = false)
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	    private LocalDateTime createdDate = LocalDateTime.now();

	    @Column(name = "createdBy", nullable = false)
	    private String createdBy = "System";
	
}
