package com.viv.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String>
{
	public String coursePrefix;
	@Override
	public boolean isValid(String theUserInput, ConstraintValidatorContext arg1) {	
		if(theUserInput!=null)
		{
		boolean result = theUserInput.startsWith(coursePrefix);
		return result;
		}
		
		else
		return false;
	}
	
	@Override 
	public void initialize(CourseCode theCourseCode){
		coursePrefix = theCourseCode.value();
	}


}
