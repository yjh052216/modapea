<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>고객 정보 등록</h1>

<form action="insertCustomer.do" method="post">

ID : <input type="text" name="id"><p>
PW : <input type="password" name="pw"><p>
name : <input type="text" name="name"><p>

<input type="submit" value="등록">

</form>

</body>
</html>