package com.tgb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.tgb.entity.College;
import com.tgb.entity.Student;
public class CollegeDaoImpl implements CollegeDao{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public College getCollege(String username) {
	
		String hql = "from College";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<College> list = query.list();
	
		College college=new College();
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumber().equals(username)) {
				college = list.get(i);
				flag = true;
				break;
			}
		}
		
		if (flag) {
			return college;
		} else {
			return null;
		}
	}
	
}
