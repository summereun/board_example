<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<%@ include file="member.jsp" %>
	index.jsp 파일입니다.<br>
	<a href="/sample/index?id=abc&pw=1234&name=정자바">회원가입</a>
	<!-- get -->
	<form action="/sample/memberDTO" method="get">
		<div>id:<input type="text" name="id" value="abcd"></div>
		<div>pw:<input type="password" name="pw" value="1234"></div>
		<div>name:<input type="text" name="name" value="정자바"></div>
		<input type="submit" value="회원가입">
	</form>
	
</body>
</html>