package com.te.studentmanagementsystem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",nullable = false)
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="marks")
	private double marks;
	
	@Column(name="email")
	private String email;
	
	@Column(name="grade")
	private String grade;
	
	public Student(String firstName, String lastName, double marks, String email, String grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.email = email;
		this.grade = grade;
	}

	public Student() {
			
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) { 
		this.lastName = lastName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
