<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<a href="category_update.action?category.id=1&category.type=test">update</a>
	<a href="category_update.action?id=1&type=test">update model</a>
	<a href="category_save.action">save</a>
	<a href="category_query.action">category查询所有类别</a>
	<a href="account_query.action">accout查询所有类别</a>
	<c:forEach items="${sessionScope.categoryList }" var="category">
   ${category.id }|${cagegory.type }|${category.hot }<br />
	</c:forEach>
	<c:forEach items="${applicationScope.categoryList }" var="category">
   ${category.id }|${cagegory.type }|${category.hot }<br />
	</c:forEach>
</body>
</html>
