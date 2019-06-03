package com.viv.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.viv.validation.CourseCode;


public class Customer {
	
	public String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message = "is required")
	public String lastName;
	
	@Min(value=0, message = "Must be greater than or equal to zero")
	@Max(value=10, message = "At most 10")
	public int freePass;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message=" % character thing ")
	public String postalCode; //5 char thing
	
	@CourseCode
	public String courseCode;
	

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getFreePass() {
		return freePass;
	}

	public void setFreePass(int freePass) {
		this.freePass = freePass;
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
	
	

}
