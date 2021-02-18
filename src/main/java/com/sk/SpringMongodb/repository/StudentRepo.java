/**
 * 
 */
package com.sk.SpringMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sk.SpringMongodb.dto.StudentDTO;
import com.sk.SpringMongodb.entity.document.StudentInfo;

/**
 * @author shifa kaushar
 *
 */
public interface StudentRepo extends MongoRepository<StudentInfo, String> {

	StudentDTO save(StudentDTO studentdoc); 
}
