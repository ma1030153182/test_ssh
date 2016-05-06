<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.tgb.entity.Student"%>
<%@ page import="com.tgb.entity.College"%>
<%@ page import="com.tgb.entity.Advice"%>
<html lang="en">
<head>
<meta charset="utf-8">
<title>首页</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<script
	src="http://localhost:8080/test_ssh/specialEfficts/ie10-viewport-bug-workaround.js"></script>
<link href="http://localhost:8080/test_ssh/specialEfficts/bootstrap.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="http://localhost:8080/test_ssh/css/styles.css">
<link rel="stylesheet"
	href="http://localhost:8080/test_ssh/css/buttons.css">

<script src="http://localhost:8080/test_ssh/js/responsive-nav.js"></script>
<script src="http://localhost:8080/test_ssh/js/style.js"></script>
</head>
<body>

	<%
		College college = (College) session.getAttribute("college");
	%>
	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li><a
				href="http://localhost:8080/test_ssh/college/login?username=<%=college.getNumber()%>&password=<%=college.getPassword()%>">学生报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/daish">待审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/shed">已审核的报名信息</a></li>
			<li class="active"><a href="#">按条件查询学生</a></li>

			<li><a href="http://localhost:8080/test_ssh/advice/myAdvice">已发公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index6.jsp">发布新公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/xueyzhuxiao">注销登录</a></li>
		</ul>
	</div>

	<div role="main" class="main">
		<a href="#nav" class="nav-toggle">Menu</a> 请输入您要查询学生的学号：
		<form action="http://localhost:8080/test_ssh/student/query" method="get">
			<input type="text" name="stunumber"> 
			<input type="submit" value="查询">
		</form><br><br>
		<%
			Student student = (Student) request.getAttribute("student");
			if (student != null) {
		%>
		<font size="3"> 姓名：<%=student.getStuname()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			性别：<%=student.getSex()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 学号：<%=student.getStunumber()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			身份证号：<%=student.getSfzh()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 籍贯：<%=student.getJiguan()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<br> <br> 民族：<%=student.getMinzu()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			学院：<%=student.getCollege().getName()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			专业：<%=student.getMajor().getName()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			入学年份：<%=student.getRxnf()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 婚姻状况：<%=student.getMarry()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<br> <br>

		<br><br>
		 <font size="3">
			
				家庭住址：<%=student.getAddress()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                身高：<%=student.getLength()%>cm&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               
                                体重：<%=student.getWeight() %>kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 <br><br>               
                                婚姻状况：<%=student.getMarry()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                银行卡号:      <%=student.getMoneycard()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                 <br><br> 
                担任职务:       <%=student.getZhiwu()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                邮箱 :<%=student.getEmail()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                   电话 :<%=student.getPhone()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <br><br><br><br>
                 
              
			
		</font>
		<%
			}
		%>
	</div>



</body>
</html>
