<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
</head>
<body>
	<%request.setAttribute("path", request.getContextPath()); %>
	<form action="${path}/login" method="post">
		<table border="1" cellspacing="0" cellpadding="20" align="center">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="登录"></td>
			</tr>
		</table>
	</form>
</body>
</html>