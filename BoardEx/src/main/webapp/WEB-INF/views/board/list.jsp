<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>list</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Berkshire+Swash&family=Covered+By+Your+Grace&family=Fredericka+the+Great&family=Libre+Barcode+39&family=Monoton&family=Shadows+Into+Light+Two&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../resources/css/style.css">


</head>
<body>
    <div class="wrap">
        <h1>LIST PAGE</h1>
        <div class="w_box">
            <table>
                <thead>
                    <tr>
                        <th>글번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                        <th>조회수</th>
                        <th>좋아요</th>
                    </tr>
                </thead>
                <tbody>
                	<c:forEach items="${list}" var="board">
	                    <tr>
	                        <td>${board.bno}</td>
	                        <td><a href="/board/detail?bno=${board.bno}">${board.title}</a></td>
	                        <td>${board.writer}</td>
	                        <td>${board.regdate}</td>
	                        <td>${board.cnt}</td>
	                        <td>${board.good}</td>
	                    </tr>
                    </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
    <!--.wrap-->
</body>
</html>