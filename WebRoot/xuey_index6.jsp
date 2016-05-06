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

<link href="themes/default/css/umeditor.css" type="text/css"
	rel="stylesheet">
<script type="text/javascript" src="third-party/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8" src="umeditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="umeditor.min.js"></script>
<script type="text/javascript" src="lang/zh-cn/zh-cn.js"></script>


<style type="text/css">
h1 {
	font-family: "微软雅黑";
	font-weight: normal;
}

.btn {
	display: inline-block;
	*display: inline;
	padding: 4px 12px;
	margin-bottom: 0;
	*margin-left: .3em;
	font-size: 14px;
	line-height: 20px;
	color: #333333;
	text-align: center;
	text-shadow: 0 1px 1px rgba(255, 255, 255, 0.75);
	vertical-align: middle;
	cursor: pointer;
	background-color: #f5f5f5;
	*background-color: #e6e6e6;
	background-image: -moz-linear-gradient(top, #ffffff, #e6e6e6);
	background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff),
		to(#e6e6e6));
	background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6);
	background-image: -o-linear-gradient(top, #ffffff, #e6e6e6);
	background-image: linear-gradient(to bottom, #ffffff, #e6e6e6);
	background-repeat: repeat-x;
	border: 1px solid #cccccc;
	*border: 0;
	border-color: #e6e6e6 #e6e6e6 #bfbfbf;
	border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
	border-bottom-color: #b3b3b3;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px;
	border-radius: 4px;
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffffff',
		endColorstr='#ffe6e6e6', GradientType=0);
	filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);
	*zoom: 1;
	-webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	-moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
}

.btn:hover,.btn:focus,.btn:active,.btn.active,.btn.disabled,.btn[disabled]
	{
	color: #333333;
	background-color: #e6e6e6;
	*background-color: #d9d9d9;
}

.btn:active,.btn.active {
	background-color: #cccccc \9;
}

.btn:first-child {
	*margin-left: 0;
}

.btn:hover,.btn:focus {
	color: #333333;
	text-decoration: none;
	background-position: 0 -15px;
	-webkit-transition: background-position 0.1s linear;
	-moz-transition: background-position 0.1s linear;
	-o-transition: background-position 0.1s linear;
	transition: background-position 0.1s linear;
}

.btn:focus {
	outline: thin dotted #333;
	outline: 5px auto -webkit-focus-ring-color;
	outline-offset: -2px;
}

.btn.active,.btn:active {
	background-image: none;
	outline: 0;
	-webkit-box-shadow: inset 0 2px 4px rgba(0, 0, 0, 0.15), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	-moz-box-shadow: inset 0 2px 4px rgba(0, 0, 0, 0.15), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	box-shadow: inset 0 2px 4px rgba(0, 0, 0, 0.15), 0 1px 2px
		rgba(0, 0, 0, 0.05);
}

.btn.disabled,.btn[disabled] {
	cursor: default;
	background-image: none;
	opacity: 0.65;
	filter: alpha(opacity = 65);
	-webkit-box-shadow: none;
	-moz-box-shadow: none;
	box-shadow: none;
}
</style>
</head>
<body id="main">
	<%
		College college = (College) session.getAttribute("college");
	%>
	<div role="navigation" id="foo" class="nav-collapse">
		<ul>
			<li><a
				href="http://localhost:8080/test_ssh/college/login?username=<%=college.getNumber()%>&password=<%=college.getPassword()%>">学生报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/student/daish">待审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/shed">已审核的报名信息</a></li>
			<li><a href="http://localhost:8080/test_ssh/xuey_index4.jsp">按条件查询学生</a></li>

			<li><a href="http://localhost:8080/test_ssh/advice/myAdvice">已发公告</a></li>
			<li class="active"><a href="#">发布新公告</a></li>
			<li><a href="http://localhost:8080/test_ssh/college/xueyzhuxiao">注销登录</a></li>
		</ul>
	</div>
	<div>
		<div role="main" class="main">
		  <font size="5">
		  通知标题：<input type="text" id="title" style="width:98%"/><br><br>
		  </font>
			<script type="text/plain" id="myEditor"
				style="width:1000px;height:340px;">
               <p>这里我可以写一些输入提示</p>
           </script><br><br>
			<span class="button-wrap"> 
			<button class="button button-pill button-raised button-primary" onclick="return validate()" style="width:1000px">Go</button>
			</span>
		</div>

	</div>

	</div>
	<script type="text/javascript">
		//实例化编辑器
		var um = UM.getEditor('myEditor');
		um.addListener('blur', function() {
			$('#focush2').html('编辑器失去焦点了')
		});
		um.addListener('focus', function() {
			$('#focush2').html('')
		});
	</script>

</body>
</html>
