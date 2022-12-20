package com.masai.Service;

import org.springframework.stereotype.Service;

import com.masai.Entity.Courses;
import com.masai.Entity.Student;

@Service
public interface AdminService {

	Courses uploadCourse(Courses course);

	Student getStudentByName(String studentName);


	
}
