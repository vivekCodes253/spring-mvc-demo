package com.viv.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	public String value() default "VIV";
	public String message() default "VIV must be the initial";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
	
	
	
	
	
}
