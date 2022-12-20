package com.masai.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;


@Entity
public class Admin {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "{notNull}")
	private String adminId;
	
}
