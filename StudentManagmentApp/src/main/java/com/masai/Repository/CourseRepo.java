package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Courses;

@Repository
public interface CourseRepo extends JpaRepository<Courses, Integer> {

}
