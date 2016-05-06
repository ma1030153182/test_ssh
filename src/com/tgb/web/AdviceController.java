package com.tgb.web;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.HandlerInterceptor;

import com.tgb.entity.Advice;
import com.tgb.entity.College;
import com.tgb.entity.Student;
import com.tgb.manager.AdviceManager;

@Controller
@RequestMapping("/advice")
public class AdviceController {

	@Resource(name = "adviceManager")
	private AdviceManager adviceManager;

	public AdviceManager getAdviceManager() {
		return adviceManager;
	}

	public void setAdviceManager(AdviceManager adviceManager) {
		this.adviceManager = adviceManager;
	}

	@RequestMapping("/getAdvice")
	public String getAdviceByCollege(HttpServletRequest request) {

		HttpSession session = request.getSession();
		Student student = (Student) session.getAttribute("student");
		College college = student.getCollege();

		List<Advice> list = adviceManager.getAdviceByCollege(college);

		request.setAttribute("list", list);
		return "/stu_index2.jsp";
	}

	@RequestMapping("/myAdvice")
	public String getAdviceByCollege2(HttpServletRequest request) {
	
		HttpSession session = request.getSession();
		College college = (College) session.getAttribute("college");
		List<Advice> list = adviceManager.getAdviceByCollege(college);
		request.setAttribute("list", list);
		
		return "/xuey_index5.jsp";
	}
	
	@RequestMapping("/delete")
	public String deleteAdviceById(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id").trim());
		adviceManager.deleteAdvice(id);
		return "redirect: http://localhost:8080/test_ssh/advice/myAdvice";
	}
	@RequestMapping("/addAdvice")
	public String addAdvice(HttpServletRequest request){
		
		Advice advice=new Advice();
		String title=request.getParameter("title");
		String content=request.getParameter("content");

		Date currentDate = new java.sql.Date(System.currentTimeMillis());
		HttpSession session=request.getSession();
		College college=(College)session.getAttribute("college");
		advice.setTitle(title);
		advice.setContent(content);
		advice.setShijian(currentDate);
		advice.setCollege(college);
		
		
		
		adviceManager.addAdvice(advice);
		return "";
	}
	
}
