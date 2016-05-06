package com.tgb.manager;

import java.util.ArrayList;
import java.util.List;

import com.tgb.dao.AdviceDao;
import com.tgb.dao.StudentDao;
import com.tgb.entity.Advice;
import com.tgb.entity.College;

public class AdviceManagerImpl implements AdviceManager{
	private AdviceDao adviceDao;
	


	public AdviceDao getAdviceDao() {
		return adviceDao;
	}


	public void setAdviceDao(AdviceDao adviceDao) {
		this.adviceDao = adviceDao;
	}


	@Override
	public List<Advice> getAllAdvice() {
		// TODO Auto-generated method stub
		return adviceDao.getAllAdvice();
	}


	@Override
	public List<Advice> getAdviceByCollege(College college) {
		List<Advice> list=getAllAdvice();
	
		List<Advice> list1 = new ArrayList<Advice>();
		for (int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getCollege().getId().equals(college.getId())){
			
				list1.add(list.get(i));
			}
		}
		
		return list1;
	}


	@Override
	public void deleteAdvice(int id) {
		// TODO Auto-generated method stub
		adviceDao.deleteAdviceById(id);
	}


	@Override
	public void addAdvice(Advice advice) {
		adviceDao.addAdvice(advice);
		
	}
	
}
