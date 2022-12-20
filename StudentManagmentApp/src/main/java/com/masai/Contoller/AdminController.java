package com.masai.Contoller;

import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Courses;
import com.masai.Entity.Student;
import com.masai.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService aService;
	  
	@PostMapping("/admin/courses")
	public Courses uploadCourses(@RequestParam Courses course)
	{
		Courses course1 = aService.uploadCourse(course);
		
		return course1;
		
	}
	
	
	@GetMapping("/student/{name}")
	public Student getStudentByName(@PathVariable("name") String StudentName)
	{
		Student student = aService.getStudentByName(StudentName);
		
		return null;
		
	}
	
	
}
