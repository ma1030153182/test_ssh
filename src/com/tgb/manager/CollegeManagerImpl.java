package com.tgb.manager;

import com.tgb.dao.CollegeDao;
import com.tgb.entity.College;

public class CollegeManagerImpl implements CollegeManager{
    private CollegeDao collegeDao;
    
	public CollegeDao getCollegeDao() {
		return collegeDao;
	}

	public void setCollegeDao(CollegeDao collegeDao) {
		this.collegeDao = collegeDao;
	}

	@Override
	public College login(String username) {
		// TODO Auto-generated method stub
		
		return collegeDao.getCollege(username);
	}

}
