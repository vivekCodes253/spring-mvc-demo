package com.viv.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cust")
public class customercontroller {
	
	@InitBinder
	public void init(WebDataBinder dataBinder)
	{
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer", new Customer());
		return "customerform";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
			return "customerform";
		else
			return "customer-confirmation";
	}

}
