package com.kali.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.kali.beans.Student;
import com.kali.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentController extends MultiActionController{
	
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String sid=request.getParameter("sid");
		String sname=request.getParameter("sname");
		String saddr=request.getParameter("saddr");
		System.out.println(sid+" "+sname+" "+saddr+"");
		Student student=new Student();
		String status=studentService.addStudent(student);
		String message="";
		if(status.equalsIgnoreCase("success")) {
			message="Studend Added Successfully";
		}else {
			message="Student Insertion failure";
		}
		
		return new ModelAndView("status","message", message);
		
	}

}
