package com.tgb.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tgb.dao.AdviceDao;
import com.tgb.entity.College;
import com.tgb.entity.Student;
import com.tgb.manager.AdviceManager;
import com.tgb.manager.SchoolManager;
import com.tgb.manager.StudentManager;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Resource(name="studentManager")
	private StudentManager studentManager;
    
	@Resource(name="schoolManager")
	private SchoolManager schoolManager;
	
	
	
	public StudentManager getStudentManager() {
		return studentManager;
	}

	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public SchoolManager getSchoolManager() {
		return schoolManager;
	}

	public void setSchoolManager(SchoolManager schoolManager) {
		this.schoolManager = schoolManager;
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request){
	
		String stunumber=request.getParameter("username");
		String password=request.getParameter("password");
	
		Student student=studentManager.getStudent(stunumber);
	
		if(student!=null&&student.getPassword().equals(password)){
			HttpSession session=request.getSession();
			session.setAttribute("student", student);
			session.setAttribute("school", schoolManager.getSchool());
			return "/stu_index.jsp";
		}else{
			return "/loginError.html";
		}
		
	}
	
	@RequestMapping("/updateStudent")
	public String update(HttpServletRequest request){
	
	
		Student student=null;
		HttpSession session=request.getSession();
		student=(Student)session.getAttribute("student");
		
		studentManager.updateStudent(request,student.getId());
	    return "";
	}
	
	
	@RequestMapping("/cetf")
	public String cetfbm(HttpServletRequest request){
		Student student=null;
		HttpSession session=request.getSession();
		student=(Student)session.getAttribute("student");
	    student.setCetf(2);
	    session.setAttribute("student", student);
		studentManager.updatecetfbm(request, student.getId());
		return "/stu_index3.jsp";
	}
	
	
	@RequestMapping("/cets")
	public String cetsbm(HttpServletRequest request){
		Student student=null;
		HttpSession session=request.getSession();
		student=(Student)session.getAttribute("student");
	    student.setCets(2);
	    session.setAttribute("student", student);
		studentManager.updatecetsbm(request, student.getId());
		return "/stu_index4.jsp";
	}
	
	@RequestMapping("/computerbm")
	public String computerbm(HttpServletRequest request){
		Student student=null;
		HttpSession session=request.getSession();
		student=(Student)session.getAttribute("student");
	    student.setComputer(2);
	    session.setAttribute("student", student);
		studentManager.updatecomputerbm(request, student.getId());
		return "/stu_index5.jsp";
	}
	
	@RequestMapping("/daish")
	public String getDaishByCollege(HttpServletRequest request){
		HttpSession session=request.getSession();
		College college=(College)session.getAttribute("college");
		List<Student> list=studentManager.getStudentByCollege(college.getId());
		List<Student> list2=new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getCetf()==2||list.get(i).getCets()==2||list.get(i).getComputer()==2){
				list2.add(list.get(i));
			}
		}
		request.setAttribute("list", list2);
		list=null;
		return "/xuey_index2.jsp";
	}
	
	
	@RequestMapping("/query")
	public String getStudentByNumber(HttpServletRequest request){
		String username=request.getParameter("stunumber");
		Student student=studentManager.getStudent(username);
		request.setAttribute("student", student);
		return "/xuey_index4.jsp";
	}
	
	@RequestMapping("/stuzhuxiao")
	public String stuzhuxiao(HttpServletRequest request){
		HttpSession session=request.getSession();
		session.removeAttribute("student");
		return "/stu_Login.jsp";
	}


	
	
	
	
	
	
}