<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세 정보</title>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
	
}
body{
width: 1263px;
height: 600px;
}
#detailBook{
width: 1263px;
height: 600px;
align-content: center;
}
h1{
background-color:#04B431;
font-family: "맑은 고딕";
font-size: 25px;
}


img{
	width:200px;
    height:320px;
}

	
</style>
</head>
<body>
	<div id="detailBook" align="center" >
		<h1>도서 상세정보</h1>
		<form action="book_lend" method="post" name="formm">
					
			<input type="hidden" name="book_code" value="${bookVO.book_code}">
			<table>
				<tr align="center">
					<td><img src="book_images/${bookVO.image }"></td>
					<td align="left">
						<h3>도서 제목</h3>
						<h3>저자</h3>
						<h3>출판사</h3>
						<h3>장르</h3>
						<h3>가격</h3>
						
					</td>
					<td align="left">
						<h3>${bookVO.title }</h3>
						<h3>${bookVO.author }</h3>
						<h3>${bookVO.publisher}</h3>
						<h3>${bookVO.genre }</h3>
						<h3>${bookVO.price }원</h3>
					</td>
				</tr>

				<tr>
					<td align="right"><h3>대출 여부</h3></td>
					<c:choose>
						<c:when test="${bookVO.rentyn eq 'y'}">
						<td align="right">대출중</td>
						</c:when>
						<c:otherwise>
						<td align="right">대출 가능</td>
						</c:otherwise>
					</c:choose>
				</tr>
				<tr align="right">
					<td><input type="submit" value="대출" class="submit"></td>
				</tr>
			</table>
			
		</form>
	</div>
</body>
</html>


