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
<title>�n�J���\</title>
</head>
<body>
<div class="center-box">
<h2><%=m.getName()%> �n�J���\</h2>
<a href="../porder/index.jsp">�i�J�ʪ�</a>
</div>
</body>
</html>