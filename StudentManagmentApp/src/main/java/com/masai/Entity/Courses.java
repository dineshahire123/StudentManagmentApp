package com.masai.Entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "{notNull}")
	private int courseId;
	
	@NotNull(message = "{notNull}")
    private String courseType;
	
	@ManyToMany(mappedBy = "course", fetch = FetchType.LAZY)
	@JoinColumn(name = "studentId")
	private Set<Student> student;


   private Set<Courses> course;


public Courses() {
	super();
	// TODO Auto-generated constructor stub
}


public Courses(@NotNull(message = "{notNull}") int courseId, @NotNull(message = "{notNull}") String courseType,
		Set<Student> student, Set<Courses> course) {
	super();
	this.courseId = courseId;
	this.courseType = courseType;
	this.student = student;
	this.course = course;
}


public int getCourseId() {
	return courseId;
}


public void setCourseId(int courseId) {
	this.courseId = courseId;
}


public String getCourseType() {
	return courseType;
}


public void setCourseType(String courseType) {
	this.courseType = courseType;
}


public Set<Student> getStudent() {
	return student;
}


public void setStudent(Set<Student> student) {
	this.student = student;
}


public Set<Courses> getCourse() {
	return course;
}


public void setCourse(Set<Courses> course) {
	this.course = course;
}


@Override
public String toString() {
	return "Courses [courseId=" + courseId + ", courseType=" + courseType + ", student=" + student + ", course="
			+ course + "]";
}

	
   
   
}
