<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.tgb.entity.Student"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>注意事项</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="http://localhost:8080/test_ssh/specialEfficts/bootstrap.css"
	rel="stylesheet">
<link href="http://localhost:8080/test_ssh/css/buttons.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://localhost:8080/test_ssh/css/styles.css">
<script src="http://localhost:8080/test_ssh/js/responsive-nav.js"></script>
</head>
<body>

	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li><a href="http://localhost:8080/test_ssh/stu_index.jsp">个人中心</a></li>
			<li><a href="http://localhost:8080/test_ssh/advice/getAdvice">注意事项</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index3.jsp">英语四级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index4.jsp">英语六级报名</a></li>
			<li class="active"><a href="#">计算机专业等级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/stuzhuxiao">注销登录</a></li>
		</ul>
	</div>
	<%
		Student student = (Student) session.getAttribute("student");
	%>
	<div role="main" class="main">
		<a href="#nav" class="nav-toggle">Menu</a>


		<%
			int cet = 0;
			if (student.getComputer() == 1) {
		%>
		<font size="5"> 您的计算机等级考试状态为“未报名”，可点击下方的报名按钮参与报名</font><br>
		<br> <font size="5"> 注：一旦参与报名，则不可撤销，请谨慎！！！！</font><br>
		<br>
		<span class="button-wrap">
           <a href="http://localhost:8080/test_ssh/student/computerbm" class="button button-pill button-raised button-primary">报名参加计算机等级考试</a>
        </span>
		<%
			}
			if(student.getComputer() == 2){%>
			<font size="5"> 您的计算机等级考试状态为“已报名”，正在等待学院审核。。。</font><br>
			<%
			}
			
			if(student.getComputer() == 3){%> 
			<font size="5"> 您的计算机等级考试状态为“已审核”，可以参加接下来的计算机专业等级考试</font><br>
			<%
			}
			
			if(student.getComputer() == 4){%> 
			<font size="5"> 您的计算机等级考试状态为“已通过”，</font><br>
			<%
			}
		%>
	</div>

</body>
</html>
