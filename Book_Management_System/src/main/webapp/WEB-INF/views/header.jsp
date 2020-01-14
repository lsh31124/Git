<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Managemwnt System</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/components.css">
<link rel="stylesheet" href="css/icons.css">
<link rel="stylesheet" href="css/responsee.css">
<link rel="stylesheet" href="owl-carousel/owl.carousel.css">
<link rel="stylesheet" href="owl-carousel/owl.theme.css">
<!-- CUSTOM STYLE -->
<link rel="stylesheet" href="css/template-style.css">
<link href="  " rel="stylesheet" type="text/css">
<script type="text/javascript" src="book/book_lend.js"></script>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/validation.js"></script>
<script type="text/javascript" src="js/responsee.js"></script>
<script type="text/javascript" src="owl-carousel/owl.carousel.js"></script>
<script type="text/javascript" src="js/template-scripts.js"></script>
<script type="text/javascript" src="js/user.js"></script>
<script type="text/javascript" src="js/mypage.js"></script>
<script>
	$(document).ready(function() {
		$("#searchButton").click(function(){
			var url = "book_list?";
			
			url = url + "searchType=" + $("#searchType").val()
					  + "&keyword=" + encodeURIComponent($("#keyword").val());
			
					location.href = url;
		});
	})
</script>
 </head>
<body class="size-1140">
  	<!-- PREMIUM FEATURES BUTTON -->
  	<!-- <a target="_blank" class="hide-s" href="../template/prospera-premium-responsive-business-template/" style="position:fixed;top:120px;right:-14px;z-index:10;"><img src="images/premium-features.png" alt=""></a> -->
    <!-- HEADER -->
	<!-- Top Navigation -->
	<header role="banner">
		<nav class="background-white background-primary-hightlight">
			<div class="line">
				<div class="s-12 l-2">
					<a href="index" class="logo"><img alt="" src="./images/logo-01.jpg" ></a>

				</div>
				<div class="top-nav s-12 l-10">
					<ul class="right chevron">
								<li><a href="book_list">도서 목록</a></li>
						<c:choose>
							<c:when test="${empty sessionScope.loginUser}">
								<li><a href="login_form">로그인</a></li>
								<li><a href="join_form">회원가입</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="mypage">나의 도서 목록</a></li>
								<li><a href="Credentials">${sessionScope.loginUser.name}(${sessionScope.loginUser.id})</a></li>
								<li><a href="logout">로그아웃</a></li>
							</c:otherwise>
							</c:choose>
					</ul>
				</div>

				<div class="book_search" align="right">
				<form action="getSearch" method="get">
					<select name="searchType" id="searchType" style="height:39px;font-size:14px;">
						<option value="t">도서제목</option>
						<option value="a">저자</option>
						<option value="c">내용</option>
					</select>
					<input type="text" name="keyword" id="keyword" placeholder="입력하세요" style="width:250px;height:39px;">
					<input class="button" type="button" id="searchButton" value="검색">
				</form>
				</div>
			</div>
		</nav>
	</header>