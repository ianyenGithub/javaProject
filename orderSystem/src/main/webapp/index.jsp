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
<title>會員登入頁面</title>
</head>
<body>
<form action="LoginController" class="center-box" method="post">
	<h2>會員登入</h2>
	帳號:<input type="text" name="username"><br><br>
	密碼:<input type="password" name="password"><br><br>
	<input type="submit" value="送出">
</form>
</body>
</html>