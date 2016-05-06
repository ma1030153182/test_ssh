package com.tgb.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpRequest;

import com.tgb.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Student getStudent(String stunumber) {
		Student student = null;
		List<Student> list = getAllStudent();

		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStunumber().equals(stunumber)) {
				student = list.get(i);
				flag = true;
				break;
			}
		}

		if (flag) {
		
			return student;
		} else {
			return null;
		}

	}

	@Override
	public List<Student> getAllStudent() {
		String hql = "from Student";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Student> list = query.list();
		return list;
	}

	@Override
	public void updateStudent(HttpServletRequest request, int id) {
		String address = request.getParameter("address").trim();
		int length = Integer.parseInt(request.getParameter("length").trim());
		int weight = Integer.parseInt(request.getParameter("weight").trim());
		String marry = request.getParameter("marry").trim();
		String moneyCard = request.getParameter("moneyCard").trim();
		String zhiwu = request.getParameter("zhiwu").trim();
		String email = request.getParameter("email").trim();
		String phone = request.getParameter("phone").trim();

		String hql = "update Student stu set stu.address = ?,stu.length=?,stu.weight=?,stu.marry=?,stu.moneycard=?,stu.zhiwu=?,stu.email=?,stu.phone=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, address);
		query.setInteger(1, length);
		query.setInteger(2, weight);
		query.setString(3, marry);
		query.setString(4, moneyCard);
		query.setString(5, zhiwu);
		query.setString(6, email);
		query.setString(7, phone);
		query.setInteger(8, id);
		query.executeUpdate();

	}

	@Override
	public void updatecetfbm(HttpServletRequest request, int id) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.cetf=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 2);
		query.setInteger(1, id);
		query.executeUpdate();
	}

	@Override
	public void updatecetsbm(HttpServletRequest request, int id) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.cets=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 2);
		query.setInteger(1, id);
		query.executeUpdate();
		
	}

	@Override
	public void updatecomputerbm(HttpServletRequest request, int id) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.computer=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 2);
		query.setInteger(1, id);
		query.executeUpdate();
	}


	@Override
	public void shenheCetf(int stuId) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.cetf=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 3);
		query.setInteger(1, stuId);
		query.executeUpdate();
	}

	@Override
	public void shenheCets(int stuId) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.cets=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 3);
		query.setInteger(1, stuId);
		query.executeUpdate();
	}

	@Override
	public void shenheComputer(int stuId) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.computer=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 3);
		query.setInteger(1, stuId);
		query.executeUpdate();
	}

	@Override
	public void passCetf(int stuId) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.cetf=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 4);
		query.setInteger(1, stuId);
		query.executeUpdate();
	}

	@Override
	public void passCets(int stuId) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.cets=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 4);
		query.setInteger(1, stuId);
		query.executeUpdate();
	}

	@Override
	public void passComputer(int stuId) {
		// TODO Auto-generated method stub
		String hql = "update Student stu set stu.computer=? where stu.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, 4);
		query.setInteger(1, stuId);
		query.executeUpdate();
	}

}