package com.kssk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kssk.command.Student;
import com.kssk.exceptions.StudentMarksOutOfBoundsException;

@Controller	
public class StudentController {
	

@RequestMapping(value="/reg",method=RequestMethod.GET)
	public ModelAndView showStudentForm()
	{
		return new ModelAndView("student_form","student",new Student());
	}

@RequestMapping(value="/reg",method=RequestMethod.POST)

public ModelAndView registration(Student student,ModelMap model) {
	if(student.getSmarks()<0 || student.getSmarks()>100)
	{
		throw new StudentMarksOutOfBoundsException("Invalid student marks please provide student marks in between 0 to 100");
		
	}
	
return new ModelAndView("studentdetails","student",student);
}

	}
