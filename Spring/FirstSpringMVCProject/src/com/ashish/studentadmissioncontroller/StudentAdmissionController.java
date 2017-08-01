package com.ashish.studentadmissioncontroller;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","Ashish College of Technical Education");	
	}
	
	@InitBinder
	public void initinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yy");
		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateformat, false));
		binder.registerCustomEditor(String.class,"studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	protected ModelAndView getAdmissionForm() {
		
		ModelAndView modelandview = new ModelAndView("AdmissionForm");
			    
		return modelandview;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	protected ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {
		
		if(result.hasErrors()){
			ModelAndView modelandview = new ModelAndView("AdmissionForm");
		    
			return modelandview;
		}
		ModelAndView modelandview = new ModelAndView("AdmissionSuccess");
			    
		return modelandview;
	}
	
	@ResponseBody
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public ArrayList<Student> getStudentsList(){
	 ArrayList<Student> studentList = new ArrayList<Student>();
		for(int i=0;i<=5;i++){
			Student student = new Student();
			student.setStudentName("Mr. Name-" + (i+1));
			student.setStudentMobile("+" + (1111111111*(i+1)));
			studentList.add(student);
			
		}
		return studentList;
	
		
	}
	
}
