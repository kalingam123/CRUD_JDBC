package com.kali.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kali.beans.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String add(Student student) {
		int rowCount=jdbcTemplate.update("insert into student values('"+student.getSid()+"','"
				+student.getSname()+"','"+student.getSaddr()+"')");
		String status="";
		if(rowCount==1) {
			status="success";
		}else {
			status="failure";
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
