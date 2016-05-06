package com.tgb.manager;

import java.util.List;

import com.tgb.dao.SchoolDao;
import com.tgb.entity.School;
import com.tgb.entity.Student;



public class SchoolManagerImpl implements SchoolManager{
	private SchoolDao schoolDao;
	
	public SchoolDao getSchoolDao() {
		return schoolDao;
	}

	public void setSchoolDao(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}

	@Override
	public School getSchool() {
		// TODO Auto-generated method stub
		return schoolDao.getSchool();
	}

	

}