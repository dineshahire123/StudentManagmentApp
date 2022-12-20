package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Admin;
import com.masai.Entity.Student;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

	
	
}
