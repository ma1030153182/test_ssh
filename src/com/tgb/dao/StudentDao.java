package com.tgb.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;

import com.tgb.entity.Student;



public interface StudentDao {

	public Student getStudent(String stunumber);
	
	public List<Student> getAllStudent();
	
	public void updateStudent(HttpServletRequest request,int id);

	public void updatecetfbm(HttpServletRequest request,int id);

	public void updatecetsbm(HttpServletRequest request,int id);
	
	public void updatecomputerbm(HttpServletRequest request,int id);
	
	public void shenheCetf(int stuId);
	public void shenheCets(int stuId);
	public void shenheComputer(int stuId);
	
	public void passCetf(int stuId);
	public void passCets(int stuId);
	public void passComputer(int stuId);
//	public List<Student> getStudentShByCollege(int id);
}