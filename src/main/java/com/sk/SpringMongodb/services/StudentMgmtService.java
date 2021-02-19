/**
 * 
 */
package com.sk.SpringMongodb.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.SpringMongodb.dto.StudentDTO;
import com.sk.SpringMongodb.entity.document.StudentInfo;
import com.sk.SpringMongodb.repository.StudentRepo;

/**
 * @author shifa kaushar
 *
 */
@Service("stuservice")
public class StudentMgmtService implements IStudentService {
	@Autowired
	
	private StudentRepo studentRepo;
	

	@Override
	public String registerStudent(StudentDTO studentdto) {
		//convert dto to student obj
		StudentInfo studentdoc = new StudentInfo();
		//copying dto to doc
		BeanUtils.copyProperties(studentdto, studentdoc);
//		System.out.println(studentdto);
//		System.out.println(studentdoc);
		//save document
		studentdoc=studentRepo.insert(studentdoc);
		
		return "Document is saved having sno:"+studentdoc.getSno();
	}

	@Override
	public List<StudentInfo> findAll() {
		
		return studentRepo.findAll();
	}

	

	@Override
	public String deleteBySno(Integer sno) {
		
		
	StudentInfo studentInfo	=studentRepo.findBySno(sno);
		
		studentRepo.delete(studentInfo);
		return "Deleted Record "+sno;
	}

	


	@Override
	public StudentInfo updateStudent(StudentDTO studentDto) {
		//convert dto  to doc
		StudentInfo studentdoc=new StudentInfo();
		BeanUtils.copyProperties(studentDto, studentdoc);
		//update the document
	 StudentInfo response =	studentRepo.save(studentdoc);
		return response;
	}

}



