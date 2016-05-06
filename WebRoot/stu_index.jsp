<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.tgb.entity.Student"%>

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
		Student student = (Student) session.getAttribute("student");
	%>
	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li class="active"><a href="#">个人中心</a></li>
			<li><a href="http://localhost:8080/test_ssh/advice/getAdvice">注意事项</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index3.jsp">英语四级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index4.jsp">英语六级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index5.jsp">计算机专业等级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/stuzhuxiao">注销登录</a></li>
		</ul>
	</div>

	<div role="main" class="main">
		<a href="#nav" class="nav-toggle">Menu</a>
		<h1>
			欢迎,<%=student.getStuname()%></h1>
		<br>

		<hr>
		<h4>您的个人基本信息如下,请核对（如果有所更改请更新完信息后点击下放的蓝色按钮）</h4>
		<hr>

		<font size="3"> 姓名：<%=student.getStuname()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			性别：<%=student.getSex()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 学号：<%=student.getStunumber()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			身份证号：<%=student.getSfzh()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 籍贯：<%=student.getJiguan()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<br> <br> 民族：<%=student.getMinzu()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			学院：<%=student.getCollege().getName()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			专业：<%=student.getMajor().getName()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			入学年份：<%=student.getRxnf()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 婚姻状况：<%=student.getMarry()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<br> <br>

		</font> <font size="1" color="red">*以下信息可修改</font><br><br>
		 <font size="3">
			
				家庭住址：<input type="text" id="address" value="<%=student.getAddress()%>" style="width:300px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                身高：<input type="text" id="length" value="<%=student.getLength()%>" style="width:150px"/>cm&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               
                                体重：<input type="text" id="weight" value="<%=student.getWeight() %>" style="width:150px"/>kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 <br><br>               
                                婚姻状况：<input type="text" id="marry" value="<%=student.getMarry()%>" style="width:300px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                银行卡号:      <input type="text" id="moneyCard" value="<%=student.getMoneycard()%>" style="width:300px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                 <br><br> 
                担任职务:       <input type="text" id="zhiwu" value="<%=student.getZhiwu()%>" style="width:150px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                邮箱 :<input type="text" id="email" value="<%=student.getEmail()%>" style="width:300px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
                   电话 :<input type="text" id="phone" value="<%=student.getPhone()%>" style="width:200px"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <br><br><br><br>
                 
               <button class="button button-block button-rounded button-royal button-large" style="width:100%" onclick="update()">确认修改</button>
			
		</font>
	</div>

</body>
</html>
