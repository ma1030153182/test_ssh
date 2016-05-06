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
<% College college=(College)session.getAttribute("college"); %>
	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li><a href="http://localhost:8080/test_ssh/college/login?username=<%=college.getNumber() %>&password=<%=college.getPassword() %>">学生报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/daish">待审核的报名信息</a></li>
			<li  class="active"><a href="#">已审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index4.jsp">按条件查询学生</a></li>

			<li><a href="http://localhost:8080/test_ssh/advice/myAdvice">已发公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index6.jsp">发布新公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/xueyzhuxiao">注销登录</a></li>
		</ul>
	</div>
<% List<Student> list=(List<Student>)request.getAttribute("list");
int j=0;%>
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
								<th>科目</th>
								
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						<%for(int i=0;i<list.size();i++){ %>
						    <%if(list.get(i).getCetf()==3){ %>
							<tr>
								<td><%=list.get(i).getStunumber() %></td>
								<td><%=list.get(i).getStuname() %></td>
								<td><%=list.get(i).getMajor().getName() %></td>
								<td>
								  英语四级
								</td>
								
								
								<td><input id="<%=j++ %>" type="button" value="考试通过"
                                              onclick="pass(<%=list.get(i).getId()%>,1,<%=j-1%>)" /></td> 
							</tr>
							<%} %>
							
							
							 <%if(list.get(i).getCets()==3){ %>
							<tr>
								<td><%=list.get(i).getStunumber() %></td>
								<td><%=list.get(i).getStuname() %></td>
								<td><%=list.get(i).getMajor().getName() %></td>
								<td>
								  英语六级
								</td>
								
								
								<td><input id="" type="button" value="考试通过"
                                              onclick="pass(<%=list.get(i).getId()%>,2,<%=j-1%>)" /></td> 
							</tr>
							<%} %>
							
							
							 <%if(list.get(i).getComputer()==3){ %>
							<tr>
								<td><%=list.get(i).getStunumber() %></td>
								<td><%=list.get(i).getStuname() %></td>
								<td><%=list.get(i).getMajor().getName() %></td>
								<td>
								  英语六级
								</td>
								
								
								<td><input id="" type="button" value="考试通过"
                                              onclick="pass(<%=list.get(i).getId()%>,3,<%=j-1%>)" /></td> 
							</tr>
							<%} %>
						<%} %>
						</tbody>
					</table>
				</div>
			</div>
	
	</div>

	</div>

</body>
</html>
