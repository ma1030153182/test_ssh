package com.tgb.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tgb.entity.College;
import com.tgb.entity.Student;
import com.tgb.manager.CollegeManager;
import com.tgb.manager.StudentManager;

@Controller
@RequestMapping("/college")
public class CollegeController {
	
	@Resource(name="collegeManager")
	private CollegeManager collegeManager;
	
	@Resource(name="studentManager")
	private StudentManager studentManager;
	
	
	public CollegeManager getCollegeManager() {
		return collegeManager;
	}

	public void setCollegeManager(CollegeManager collegeManager) {
		this.collegeManager = collegeManager;
	}



	public StudentManager getStudentManager() {
		return studentManager;
	}

	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		College college=null;
	
		college=collegeManager.login(username);
		
		if(college!=null && college.getPassword().equals(password)){
			HttpSession session=request.getSession();
			session.setAttribute("college", college);
		
			List<Student> list=studentManager.getStudentByCollege(college.getId());
			
			request.setAttribute("list", list);
			return "/xuey_index.jsp";
		}else{
			return "loginError.html";
		}
	}
	
	
	@RequestMapping("/shenhe")
	public String shenhe(HttpServletRequest request){
		int stuId=Integer.parseInt(request.getParameter("id").trim());
		int exam=Integer.parseInt(request.getParameter("ks").trim());

		studentManager.shenhe(stuId, exam);
		return "";
	}
	
	@RequestMapping("/shed")
	public String shed(HttpServletRequest request){
		HttpSession session=request.getSession();
		
		College college=(College) session.getAttribute("college");
		List<Student> list=studentManager.getStudentByCollege(college.getId());
		List<Student> list1=new ArrayList<Student>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getCetf()==3||list.get(i).getCets()==3||list.get(i).getComputer()==3){
				list1.add(list.get(i));
			}
		}
		list=null;
		request.setAttribute("list", list1);
		return "/xuey_index3.jsp";
	}
	
	
	@RequestMapping("/pass")
	public String pass(HttpServletRequest request){
		int stuId=Integer.parseInt(request.getParameter("id").trim());
		int exam=Integer.parseInt(request.getParameter("ks").trim());

		studentManager.pass(stuId, exam);
		return "";
	}
	
	@RequestMapping("/xueyzhuxiao")
	public String xueyzhuxiao(HttpServletRequest request){
		HttpSession session=request.getSession();
		session.removeAttribute("college");
		return "/xuey_Login.jsp";
	}
	
}
