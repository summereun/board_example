<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>write</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Berkshire+Swash&family=Covered+By+Your+Grace&family=Fredericka+the+Great&family=Libre+Barcode+39&family=Monoton&family=Shadows+Into+Light+Two&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../resources/css/style.css">

</head>
<body>
    <div class="wrap">
        <h1>WRITE PAGE</h1>
        <form action="/board/write" method="post">
        
            <div class="w_box">
                <input type="text" name="writer" class="w_input" placeholder="Writer">
            </div>
            
            <div class="w_box">
                <input type="text" name="title" class="w_input" placeholder="Title">
            </div>
            <div class="w_box">
                <textarea name="content" id="content" class="w_con" cols="30" rows="10" placeholder="Content"></textarea>
            </div>

            <a href="#">
                <input type="submit" class="up_btn w_btn" value="올리기">
            </a>
        </form>
    </div>
    <!--.wrap-->
</body>
</html>