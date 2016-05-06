package com.tgb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tgb.entity.College;
import com.tgb.entity.Student;

public class LoginInterceptor  implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=arg0.getSession();
		Student student=(Student) session.getAttribute("student");
		College college=(College)session.getAttribute("college");
		if(student==null&&college==null){
			arg1.sendRedirect("http://localhost:8080/test_ssh/loginError.html");
			return false;
		}
		else{
			return true;
		}
		
	}

}
