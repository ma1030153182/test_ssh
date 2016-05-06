<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.tgb.entity.Student"%>
<%@ page import="com.tgb.entity.College"%>
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
<link rel="stylesheet"
	href="http://localhost:8080/test_ssh/css/buttons.css">
<script src="http://localhost:8080/test_ssh/js/responsive-nav.js"></script>
</head>
<body>
	<%
		List<Advice> list=(List<Advice>)request.getAttribute("list");
	 College college=(College)session.getAttribute("college");
	%>

	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li><a
				href="http://localhost:8080/test_ssh/college/login?username=<%=college.getNumber()%>&password=<%=college.getPassword()%>">学生报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/daish">待审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/shed">已审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index4.jsp">按条件查询学生</a></li>

			<li class="active"><a href="#">已发公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index6.jsp">发布新公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/xueyzhuxiao">注销登录</a></li>
		</ul>
	</div>

	<div role="main" class="main">
		<a href="#nav" class="nav-toggle">Menu</a>



		<div class="bs-example" data-example-id="collapse-accordion">
			<div class="panel-group" id="accordion" role="tablist"
				aria-multiselectable="true">

				<%
					for(int i=0;i<list.size();i++){
				%>

				<div class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingTwo">
						<h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse"
								data-parent="#accordion" href="#<%=list.get(i).getId()%>"
								aria-expanded="false" aria-controls="<%=list.get(i).getId()%>">
								<%=list.get(i).getTitle()%>&nbsp;&nbsp;&nbsp;&nbsp;(<%=list.get(i).getShijian() %>)</a>
						</h4>
					</div>
					<div style="height: 0px;" aria-expanded="false"
						id="<%=list.get(i).getId()%>" class="panel-collapse collapse"
						role="tabpanel" aria-labelledby="headingTwo">
						<div class="panel-body">
							<%=list.get(i).getContent()%>
							<br>
							<br> <a href="http://localhost:8080/test_ssh/advice/delete?id=<%=list.get(i).getId() %>"
								class="button button-glow button-border button-rounded button-primary">
								删除这条公告 </a>
						</div>
					</div>

				</div>
				<%
					}
				%>



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
