package com.ashish.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.ashish.validator.IsValidHobby;

public class Student {
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	
	@Size(min=2, max=30) @IsValidHobby(listOfValidHobbies="Music|Programming|TT|Cricket")
	private String studentHobby;
	
	@Size(min=10) @Pattern(regexp="[0-9]*")
	private String studentMobile;
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address studentAddress;
	
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	/**
	 * @return the studentMobile
	 */
	public String getStudentMobile() {
		return studentMobile;
	}
	/**
	 * @param studentMobile the studentMobile to set
	 */
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

}
