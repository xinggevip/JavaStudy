<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 浏览器源码可见注释 -->
<%
	/* 当前源码，编译后的源码都可见的注释 */
	String name = "高星";
%>
<%-- 只能在当前源码可见注释 --%>
<h1>
<%=name %>
</h1>

</body>
</html>