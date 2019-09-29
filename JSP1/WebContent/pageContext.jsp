<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	pageContext.setAttribute("name", "gaoxing");
	
	// 设置其他session对象的key,value
	pageContext.setAttribute("request", "requestTest", pageContext.REQUEST_SCOPE);
	
	pageContext.setAttribute("session", "sessiontTest", pageContext.SESSION_SCOPE);
%>

<%=pageContext.getAttribute("name") %>

<%=request.getAttribute("request") %>

<%=session.getAttribute("session") %>

<%
	HttpSession s = pageContext.getSession();
	out.write((String)s.getAttribute("session"));
%>


</body>
</html>