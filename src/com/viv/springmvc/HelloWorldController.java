package com.viv.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class HelloWorldController {
	
	//method to show form
	
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworldform";
	}
	
	//method to process form
	
	@RequestMapping("/processform")
	public String processForm() {
		return "processor";
	}
	
	//mehod to add data to model
	@RequestMapping("/capper")
	public String shout(HttpServletRequest request, Model model)
	{
		
		String inp = request.getParameter("studentName");
		String out = inp.toUpperCase();
		model.addAttribute("message",out);
		
		return "displayboy";
	}
	
	//------------------------------------------
	
	//method to show form
	

	
	//mehod to add data to model using binding
	@RequestMapping("/capper2")
	public String shoutagain(@RequestParam("studentName") String inp, Model model)
	{
		System.out.println("Printing in the parameter method : ");
		//String inp = request.getParameter("studentName");
		String out = inp.toUpperCase();
		model.addAttribute("message",out);
		
		return "displayboy";
	}

}
