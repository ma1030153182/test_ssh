package com.tgb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.tgb.entity.School;
import com.tgb.entity.Student;

public class SchoolDaoImpl implements SchoolDao{
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public School getSchool() {
		String hql = "from School";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<School> list=query.list();
		return list.get(0);
	}

}