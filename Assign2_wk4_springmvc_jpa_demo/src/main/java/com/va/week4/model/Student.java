package com.va.week4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
//@Table(name="student")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column
	private String userName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Student(int studentId, String userName) {

		this.studentId = studentId;
		this.userName = userName;
	}

	public Student() {
	
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", userName=" + userName + "]";
	}
	
	/*
	 * do for other as per the model.. question asks.. 
	 */

	
	
}
