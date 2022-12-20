package com.masai.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.Entity.Courses;
import com.masai.Entity.Student;
import com.masai.Entity.StudentAddress;

@Service
public interface StudentService {

	Student updateDetails(int id,String email, String mobile, String motherName, String fatherName,StudentAddress address);

	Courses getCourses(int courseId);

	void courseDelete(int courseId);

	
     
	   
	
}
