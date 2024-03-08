package com.kali.service;

import com.kali.beans.Student;
import com.kali.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public String addStudent(Student student) {
		
		return studentDao.add(student);
	}

	@Override
	public Student searchStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
