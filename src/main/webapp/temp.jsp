<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ include file="/public/head.jspf"%>
<style>
#menu {
	width: 200px;
}

#menu ul {list-style = none;
	padding: 0px;
	margin: 0px;
}

#menu ul li {
	border-bottom: 1px solid #fff;
}

#menu ul li a {
	display: block;
	background-color: #00a6ac;
	color: #fff;
	padding: 5px;
	text-decoration: none;
}

#menu ul li a:hover {
	background-color:#008792;
}
</style>
</head>
<body>

	<div id="menu">
		<ul>
			<li><a href="#">aaa</a></li>
			<li><a href="">aaa</a></li>
			<li><a href="#">aaa</a></li>
			<li><a href="#">aaa</a></li>
		</ul>
	</div>

</body>
</html>
