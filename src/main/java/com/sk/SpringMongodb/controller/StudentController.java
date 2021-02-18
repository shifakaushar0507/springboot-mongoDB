/**
 * 
 */
package com.sk.SpringMongodb.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.SpringMongodb.dto.StudentDTO;
import com.sk.SpringMongodb.services.IStudentService;

/**
 * @author shifa kaushar
 *
 */
@RestController
public class StudentController {
	
	@Autowired
	IStudentService studentmgmtService;

	@PostMapping("/student")
	public ResponseEntity createStudent(@RequestBody StudentDTO studentDto) {
		
		String response = studentmgmtService.registerStudent(studentDto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	@GetMapping("/student")
	public List <StudentDTO> getStudent(@RequestBody StudentDTO studenetDto){
		
		return studentmgmtService.findAll();
		
	}

	}
	
	

	

