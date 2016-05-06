package com.tgb.manager;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.tgb.dao.StudentDao;
import com.tgb.entity.Student;

public class StudentManagerImpl implements StudentManager {

	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public Student getStudent(String stunumber) {
		// TODO Auto-generated method stub
		Student student = studentDao.getStudent(stunumber);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	@Override
	public void updateStudent(HttpServletRequest request, int id) {
		studentDao.updateStudent(request, id);
	}

	@Override
	public void updatecetfbm(HttpServletRequest request, int id) {
		studentDao.updatecetfbm(request, id);
	}

	@Override
	public void updatecetsbm(HttpServletRequest request, int id) {
		// TODO Auto-generated method stub
		studentDao.updatecetsbm(request, id);
	}

	@Override
	public void updatecomputerbm(HttpServletRequest request, int id) {
		// TODO Auto-generated method stub
		studentDao.updatecomputerbm(request, id);
	}

	@Override
	public List<Student> getStudentByCollege(int id) {

		List<Student> list = getAllStudent();

		List<Student> list1 = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCollege().getId() == id) {
				list1.add(list.get(i));
			}
		}

		return list1;

	}

	@Override
	public void shenhe(int stuid, int exampleId) {
		// TODO Auto-generated method stub
		if (exampleId == 1) {
			studentDao.shenheCetf(stuid);
		}
		if (exampleId == 2) {
			studentDao.shenheCets(stuid);
		}
		if (exampleId == 3) {
			studentDao.shenheComputer(stuid);
		}

	}

	@Override
	public void pass(int stuid, int exampleId) {
		// TODO Auto-generated method stub
		if (exampleId == 1) {
			studentDao.passCetf(stuid);
		}
		if (exampleId == 2) {
			studentDao.passCets(stuid);
		}
		if (exampleId == 3) {
			studentDao.passComputer(stuid);
		}
	}

}