<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
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
<title>建立會員</title>
</head>
<body>
<form action="../addMemberController" class="center-box" method="post">
<h2>請輸入基本資料</h2>
暱稱:<input type="text" id="name" name="name"><br><br>
帳號:<input type="text" id="username" name="username"><br><br>
密碼:<input type="text" id="password" name=password><br><br>
地址:<input type="text" id="address" name="address"><br><br>
電話:<input type="text" id="phone" name="phone"><br><br>
行動:<input type="text" id="mobile" name="mobile"><br><br>
<input type="submit" value="送出"><br><br>
<a href="../index.jsp">重新登入</a>
</form>
</body>
</html>