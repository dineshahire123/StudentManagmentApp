package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	public Student findByName(String studentName);
}
