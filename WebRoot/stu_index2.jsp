<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.tgb.entity.Student"%>
<%@ page import="com.tgb.entity.School"%>
<%@ page import="com.tgb.entity.Advice"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>注意事项</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="http://localhost:8080/test_ssh/specialEfficts/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://localhost:8080/test_ssh/css/styles.css">
<script src="http://localhost:8080/test_ssh/js/responsive-nav.js"></script>
</head>
<body>
<% List<Advice> list=(List<Advice>)request.getAttribute("list"); %>

	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li><a href="http://localhost:8080/test_ssh/stu_index.jsp">个人中心</a></li>
			<li class="active"><a href="#">注意事项</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index3.jsp">英语四级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index4.jsp">英语六级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/stu_index5.jsp">计算机专业等级报名</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/stuzhuxiao">注销登录</a></li>
		</ul>
	</div>

	<div role="main" class="main">
		<a href="#nav" class="nav-toggle">Menu</a>
	
     

		<div class="bs-example" data-example-id="collapse-accordion">
			<div class="panel-group" id="accordion" role="tablist"
				aria-multiselectable="true">

			 <% for(int i=0;i<list.size();i++){ %> 
				
				<div class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingTwo">
						<h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse"
								data-parent="#accordion" href="#<%=list.get(i).getId() %>"
								aria-expanded="false" aria-controls="<%=list.get(i).getId() %>">
								<%=list.get(i).getTitle() %>&nbsp;&nbsp;&nbsp;&nbsp;(<%=list.get(i).getShijian() %>)</a>
						</h4>
					</div>
					<div style="height: 0px;" aria-expanded="false" id="<%=list.get(i).getId() %>"
						class="panel-collapse collapse" role="tabpanel"
						aria-labelledby="headingTwo">
						<div class="panel-body">
						<%=list.get(i).getContent() %>
						</div>
					</div>
				</div>
			<%} %>
		
			

			</div>
		</div>
		<!-- /example -->
	</div>
	</div>
	<script>
		var navigation = responsiveNav("foo", {
			customToggle : ".nav-toggle"
		});
	</script>

	<script src="http://localhost:8080/test_ssh/specialEfficts/jquery.js"></script>
	<script
		src="http://localhost:8080/test_ssh/specialEfficts/bootstrap.js"></script>
	<script src="http://localhost:8080/test_ssh/specialEfficts/docs.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="http://localhost:8080/test_ssh/specialEfficts/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
