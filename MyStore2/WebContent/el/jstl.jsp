<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.gaoxing.domain.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setAttribute("count", 51);
%>
<c:if test="${count > 50 }">
<h1>count > 50</h1>
</c:if>
<c:if test="${count <= 50 }">
<h1>count <= 50</h1>
</c:if>

<hr/>

<!-- 普通forEach -->
<c:forEach begin="0" end="5" var="i">
${i }<br/>
<!-- 输出0-5  等同于${pageScope.i} -->
</c:forEach>

<hr/>

<!-- 增强forEach -->
<%
	List<String> strList = new ArrayList<String>();
	strList.add("aaa");
	strList.add("bbb");
	strList.add("ccc");
	// 往域中存数据
	request.setAttribute("strList", strList);
%>

<!--  从域中取数据 -->
<c:forEach items="${strList }" var="str">
	${str }<br/>
</c:forEach>

<hr/>

<%
	List<User> userList = new ArrayList<User>();
	User u1 = new User();
	u1.setUsername("Tom");
	
	User u2 = new User();
	u2.setUsername("jack");
	
	userList.add(u1);
	userList.add(u2);
	// 往域中存数据
	request.setAttribute("userList", userList);
%>
<!-- // 从域中取数据 -->
<c:forEach items="${userList }" var="user">
	${user.username }<br/>
</c:forEach>

<hr/>

<%
	Map<String,String> strMap = new HashMap<String,String>();
	strMap.put("name", "Tom");
	strMap.put("age", "18");
	strMap.put("addr", "shanghai");
	request.setAttribute("strMap", strMap);
	
%>
<!-- // 从域中取数据 -->
<c:forEach items="${strMap }" var="entry">
	${entry.key }:${entry.value }<br/>
</c:forEach>

</body>
</html>