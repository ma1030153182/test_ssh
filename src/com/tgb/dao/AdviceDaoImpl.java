package com.tgb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.tgb.entity.Advice;
import com.tgb.entity.School;
import com.tgb.entity.Student;

public class AdviceDaoImpl implements AdviceDao{
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<Advice> getAllAdvice() {
		String hql = "from Advice";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);	
		List<Advice> list=query.list();
		
		return list;
	}
	@Override
	public void deleteAdviceById(int id) {
		String hql = "delete Advice adv where adv.id = ?";  
        Query query = sessionFactory.getCurrentSession().createQuery(hql);  
        query.setInteger(0, id);  
          
        query.executeUpdate() ;
		
	}
	@Override
	public void addAdvice(Advice advice) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().save(advice);
	}

}
