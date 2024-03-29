<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.gaoxing.domain.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>码蚁商城</title>
    <!--链接外部样式-->
    <link rel="stylesheet" href="style/headerStyle.css">
    <!--设置标签图标-->
    <link href="favicon.ico" rel="shortcut icon">
    <link rel="stylesheet" href="style/index.css">
    <link rel="stylesheet" href="style/footerStyle.css">
    <link rel="stylesheet" href="style/pageStyle.css">
</head>
<body>

<%@ include file="header.jsp" %>

<!--热买商品-->
<div id="hot_goods">
    <h3 class="hot_goods_title">热卖商品</h3>
    <div class="hot_goods_body">
        <ul>
        <%
        	// 从域当中取数据
        	/* List<Goods> allGoods = (List<Goods>)request.getAttribute("allGoods");
        	System.out.println(allGoods);
        	if(allGoods != null){
        		for(Goods item:allGoods){
        			out.write("<li>");
        			out.write("<a href=''>");
        			out.write("<img src='./images/pimages/"+ item.getImage() +"' alt=''>");
        			out.write("<p>"+ item.getName() +"</p>");
        			out.write(" <i class='yuan'>￥</i><span class='price'>"+ item.getPrice() +"</span>");
        			out.write("</a>");
        			out.write("</li>");
        			
        		}
        	}else{
        		out.write("没有商品");
        	} */
        	
        	List<Goods> allGoods = (List<Goods>)request.getAttribute("allGoods");
        	System.out.println(allGoods);
        %>
        <c:if test="${empty allGoods }">
        	没有商品
        </c:if>
        
        
       	<c:forEach items="${allGoods }" var="item">
       		<li>
       			<a href=''>
       				<img src='./images/pimages/${item.image }' alt=''>
       				<p>${item.name } }</p>
       				<i class='yuan'>￥</i><span class='price'>${item.price }</span>
       			</a>
       		</li>
       	</c:forEach>
       
        
          	
        </ul>
    </div>
    <!--分页-->
    <div id="page" class="page_div"></div>
</div>

<%@ include file="footer.jsp" %>

<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/paging.js"></script>
<script>
    //分页
    $("#page").paging({
        pageNo:5,
        totalPage: 10,
        totalSize: 300,
        callback: function(num) {
            alert(num);
        }
    })
</script>

</body>



</html>


