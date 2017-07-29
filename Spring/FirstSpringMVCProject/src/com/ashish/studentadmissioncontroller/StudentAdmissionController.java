package com.ashish.studentadmissioncontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","Ashish College of Technical Education");	
	}
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	protected ModelAndView getAdmissionForm() {
		
		ModelAndView modelandview = new ModelAndView("AdmissionForm");
			    
		return modelandview;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	protected ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1) {
		
		ModelAndView modelandview = new ModelAndView("AdmissionSuccess");
			    
		return modelandview;
	}
}
