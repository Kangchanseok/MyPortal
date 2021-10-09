<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
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
	<form id="update-form" 
		name="updateform" 
		method="POST" 
		action="<c:url value="/users/updateform" />">
		<input type="hidden" name="no" value="${authUser.getNo() }" />
		<p>
			<label for="email">이메일</label>
			<input type="text" id="email" value="${authUser.getEmail()}" readonly   />
		</p>
		
		
		<p>
			<label for="password">새로운 비밀번호</label>
			<input type="password" id="password" name="password"  />
		</p>
		
		<p>
		<input type="submit" value="수정하기"> 
		</p>
		
		<p>
		<a href="<c:url value="/"/>">홈으로가기!</a>
		</p>
		</form>
			<%@ include file="/WEB-INF/views/includes/footer.jsp" %>
</body>
</html>