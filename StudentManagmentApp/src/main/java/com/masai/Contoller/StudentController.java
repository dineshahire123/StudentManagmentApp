package com.masai.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Courses;
import com.masai.Entity.Student;
import com.masai.Entity.StudentAddress;
import com.masai.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	@PutMapping("/students/{id}/{email}/{mobile}/{motherName}/{fatherName}/{address}")
	public Student updateDetails(@PathVariable("id") int id, @PathVariable("email") String email, @PathVariable("mobile") String mobile,@PathVariable("motherName") String motherName,@PathVariable("fatherName") String fatherName,@PathVariable("address")StudentAddress address)
	{
		Student student = sService.updateDetails(id,email, mobile,motherName,fatherName,address);
		
		return student;	
	}
	
	@GetMapping("/students/courses/{courseId}")
	public Courses getCourses(@PathVariable("courseId") int courseId)
	{
	     Courses course = sService.getCourses(courseId); 
		
		return course;	
	}
	
	@DeleteMapping("/students/courses/{courseId}")
	public String leaveCourse(@PathVariable("courseId") int courseId)
	{
		
		  sService.courseDelete(courseId); 
		
		return "Course Leave";
	}
	
	
}
