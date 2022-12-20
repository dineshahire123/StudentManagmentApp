package com.masai.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "{notNull}")
	private int  studentId;
	
	@Email
	@NotNull(message = "{notNull}")
    private String email;
    
    @Size(min = 10, message = "{MobileRange}")
    private String mobileNumber;
    @NotNull(message = "{notNull}")
    private String fatherName;
    @NotNull(message = "{notNull}")
    private String motherName;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="pincode")
    @NotNull(message = "{notNull}")
    private StudentAddress studentAddress;
    
    
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="courseId")
    @NotNull(message = "{notNull}")
    private Courses course;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(@NotNull(message = "{notNull}") int studentId, @Email @NotNull(message = "{notNull}") String email,
			@Size(min = 10, message = "{MobileRange}") String mobileNumber,
			@NotNull(message = "{notNull}") String fatherName, @NotNull(message = "{notNull}") String motherName,
			@NotNull(message = "{notNull}") StudentAddress studentAddress,
			@NotNull(message = "{notNull}") Courses course) {
		super();
		this.studentId = studentId;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.studentAddress = studentAddress;
		this.course = course;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public StudentAddress getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}


	public Courses getCourse() {
		return course;
	}


	public void setCourse(Courses course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", studentAddress=" + studentAddress
				+ ", course=" + course + "]";
	}

    
    
    
}
