<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입 성공</title>
<!-- link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/css/users.css"/ -->
<link rel="stylesheet" 
	href="<c:url value="/css/user.css" />" />
	<script src="<c:url value="/javascript/jquery/jquery-3.6.0.js" />"></script>
	<script src="<c:url value="/javascript/users.js" />"></script>
</head>
<body>
<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp" />
		<div id="wrapper">
			<div id="content">
	<h1>회원 가입 성공</h1>
	<p class="jr-success">
		회원가입을 축하합니다.
	</p>
	<p>
		<a href="/myportal/users/login">로그인하기</a>
	</p>
<%@ include file="/WEB-INF/views/includes/footer.jsp" %>
</body>
</html>