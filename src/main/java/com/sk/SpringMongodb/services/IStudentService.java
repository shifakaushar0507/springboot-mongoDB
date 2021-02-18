/**
 * 
 */
package com.sk.SpringMongodb.services;

import java.util.List;

import com.sk.SpringMongodb.dto.StudentDTO;

/**
 * @author shifa kaushar
 *
 */
public interface IStudentService {
	public String registerStudent(StudentDTO dto);
//	String updateStudent(StudentDTO dto);
    public List findAll();
//    public List findBySno();
//	public List findByName();
	//public void DeleteBySno();
	

	
}
