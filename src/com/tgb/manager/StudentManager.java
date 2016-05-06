package com.tgb.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.tgb.entity.Student;



public interface StudentManager {

	public Student getStudent(String stunumber);
	
	public List<Student> getAllStudent();
	
	public void updateStudent(HttpServletRequest request,int  id);
	
	public void updatecetfbm(HttpServletRequest request,int  id);

	public void updatecetsbm(HttpServletRequest request,int  id);
	
	public void updatecomputerbm(HttpServletRequest request,int  id);
	
	public List<Student> getStudentByCollege(int id);
	
	public void shenhe(int stuid,int exampleId);
	
	public void pass(int stuid,int exampleId);
	
}