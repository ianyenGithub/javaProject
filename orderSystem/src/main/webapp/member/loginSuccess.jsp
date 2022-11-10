<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.member"
    import="Dao.member.implMember"%>
<%
member m = (member)session.getAttribute("M");
%>
<!DOCTYPE html>
<html>
<head>
<style>
	.center-box
	{
		text-align: center;
	}
</style>
<meta charset="BIG5">
<title>登入成功</title>
</head>
<body>
<div class="center-box">
<h2><%=m.getName()%> 登入成功</h2>
<a href="../porder/index.jsp">進入購物</a>
</div>
</body>
</html>