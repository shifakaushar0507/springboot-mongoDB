/**
 * 
 */
package com.sk.SpringMongodb.services;

import java.util.List;

import com.sk.SpringMongodb.dto.StudentDTO;
import com.sk.SpringMongodb.entity.document.StudentInfo;

/**
 * @author shifa kaushar
 *
 */
public interface IStudentService {
	public String registerStudent(StudentDTO dto);
    public StudentInfo updateStudent(StudentDTO dto);
    public List findAll();
//    public List findBySno();
//	public List findByName();

	String deleteBySno(Integer sno);
	
	

	
}
