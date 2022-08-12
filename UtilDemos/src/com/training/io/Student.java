package com.training.io;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private transient int studentId;
	private String studentDepartment;

	public Student(String name, int studentId, String studentDepartment) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.studentDepartment = studentDepartment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;

	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", studentDepartment=" + studentDepartment + "]";
	}
}
