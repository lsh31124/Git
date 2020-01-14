<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 대출 메세지</title>

<style type="text/css">
body{   
 
  font-family: Verdana;
}
#wrap{     
  margin: 0 20px;
  background-color:#ffff;
}
h1 {
  font-family: "Times New Roman", Times, serif;
  font-size: 45px;
  background-color:#04B404;
  font-weight: normal;
}
input[type=button], input[type=submit] {
  float: right;
}
</style>

</head>
<body>
<div id="wrap">
  <h1>도서 대여중</h1>
  <form method=post name=formm style="margin-right:0 " action="id_check" >
  
    <div style="margin-top: 20px">   
      <c:if test="${message == 1}">
        선택하신 도서는 대출중입니다.
      </c:if>

    </div>
  </form>
</div>  
</body>
</html>