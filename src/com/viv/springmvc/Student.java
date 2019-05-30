package com.viv.springmvc;

import java.util.LinkedHashMap;

public class Student 
{
	public String[] getMulti() {
		return multi;
	}

	public void setMulti(String[] multi) {
		this.multi = multi;
	}

	private String firstName, lastName;
	public String country;
	public LinkedHashMap<String,String> countrylist;
	public String belief;
	
	public String[] multi;
	
	
	
	
	public String getBelief() {
		return belief;
	}

	public void setBelief(String belief) {
		this.belief = belief;
	}

	public Student()
	{
		countrylist = new LinkedHashMap<>();
		countrylist.put("IND","India");
		countrylist.put("AUS","Australia");
		countrylist.put("NZ","New Zealand");
		countrylist.put("SA","South Africa");
		countrylist.put("ENG","England");
	}
	
	public LinkedHashMap<String, String> getCountrylist() {
		return countrylist;
	}






	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
