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
    <title>detail</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Berkshire+Swash&family=Covered+By+Your+Grace&family=Fredericka+the+Great&family=Libre+Barcode+39&family=Monoton&family=Shadows+Into+Light+Two&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../resources/css/style.css">


</head>
<body>
    <div class="wrap">
        <h1>DETAIL PAGE</h1>
        <form>
            <div class="w_box">
                <input type="text" value="${detail.writer}" name="writer" class="w_input" placeholder="Writer" readonly>
            </div>
            
            <div class="d_box">
                <input type="text" value="${detail.title}" name="title" class="w_input d_input" placeholder="Title" readonly>
                
            </div>
            <div>
                <textarea name="content" id="content" class="w_con d_con" cols="30" rows="10" placeholder="Content" readonly>${detail.content}</textarea>
            </div>



        <div class="dd_btn">
            <a href="/board/modify?bno=${detail.bno}" class="m_btn" id="m_btn">수정</a>
            <a href="/board/remove?bno=${detail.bno}" class="d_btn" id="d_btn">삭제</a>
        </div>
        </form>
    </div>
    <!--.wrap-->
</body>
</html>