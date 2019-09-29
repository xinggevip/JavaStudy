<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	List list = new ArrayList();
%>
<!-- 静态包含，编译成一个文件 -->
<%-- <%@ include file="header.jsp" %>
<h1>主体</h1>
<%@ include file="footer.jsp" %> --%>

<!-- 动态包含，编译成三个文件 -->
<jsp:include page="header.jsp"></jsp:include>
<h1>主体</h1>
<jsp:include page="footer.jsp"></jsp:include>

<!-- 请求转发,地址不会发生变化 -->
<jsp:forward page="test.jsp"></jsp:forward>
</body>
</html>