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

	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li class="active"><a href="#">学生报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/daish">待审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/shed">已审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index4.jsp">按条件查询学生</a></li>

			<li><a href="http://localhost:8080/test_ssh/advice/myAdvice">已发公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index6.jsp">发布新公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/xueyzhuxiao">注销登录</a></li>
		</ul>
	</div>
<% List<Student> list=(List<Student>)request.getAttribute("list"); %>
	<div role="main" class="main">
		<a href="#nav" class="nav-toggle">Menu</a>
		<div class="container-fluid">
			<div class="row">


				<h2 class="sub-header">Section title</h2>
				
					<table class="table table-striped">
						<thead>
							<tr>
								<th>学号</th>
								<th>姓名</th>
								<th>专业</th>
								<th>CET4</th>
								<th>CET6</th>
								<th>计算机等级考试</th>
							</tr>
						</thead>
						<tbody>
						<%for(int i=0;i<list.size();i++){ %>
							<tr>
								<td><%=list.get(i).getStunumber() %></td>
								<td><%=list.get(i).getStuname() %></td>
								<td><%=list.get(i).getMajor().getName() %></td>
								<td>
								   <% if(list.get(i).getCetf()==1) {%>
								   未报名
								   <%} %>
								   <% if(list.get(i).getCetf()==2) {%>
								   已报名
								   <%} %>
								   <% if(list.get(i).getCetf()==3) {%>
								   已审核
								   <%} %>
								   <% if(list.get(i).getCetf()==4) {%>
								   已通过
								   <%} %>
								</td>
								<td>
								 <% if(list.get(i).getCets()==1) {%>
								   未报名
								   <%} %>
								   <% if(list.get(i).getCets()==2) {%>
								   已报名
								   <%} %>
								   <% if(list.get(i).getCets()==3) {%>
								   已审核
								   <%} %>
								   <% if(list.get(i).getCets()==4) {%>
								   已通过
								   <%} %>
								</td>
								<td>
								 <% if(list.get(i).getComputer()==1) {%>
								   未报名
								   <%} %>
								   <% if(list.get(i).getComputer()==2) {%>
								   已报名
								   <%} %>
								   <% if(list.get(i).getComputer()==3) {%>
								   已审核
								   <%} %>
								   <% if(list.get(i).getComputer()==4) {%>
								   已通过
								   <%} %>
								</td>
							</tr>
							<%} %>
						</tbody>
					</table>
				</div>
			</div>
	
	</div>

	</div>

</body>
</html>
