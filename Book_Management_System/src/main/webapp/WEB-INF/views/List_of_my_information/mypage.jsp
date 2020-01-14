<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../header.jsp" %>
<article>
    <h2 align="center"> 나의 대여 목록</h2>
    <form  action="mypage" name="formm" method="post">
    <c:choose>
    <c:when test= "${rentList.size() == 0}">
      <h3 style="color: green;text-align: center;"> 대출중인 도서가 없습니다. </h3> 
    </c:when>
    <c:otherwise>
      <table id="rentList">
        <tr>
          <th>도서명</th><th>저 자</th><th>출판사</th><th>대출 일자</th><th>도서 반납</th>    
        </tr>
        
        <c:forEach items="${rentList}"  var="bookVO">
        <tr>      
          <td>
            <a href="the_book_details?book_code=${bookVO.book_code}">
              <h3>${bookVO.title} </h3>              
            </a>    
          </td>
          <td> ${bookVO.author} </td>
          <td>${bookVO.publisher}</td>      
          <td> <fmt:formatDate value="${bookVO.rentdate}" type="date"/></td> 
          <td> <input type="checkbox" name="rseq" value= "${bookVO.rseq}"></td>     
       </tr>
        </c:forEach>
      </table> 
    </c:otherwise>  
    </c:choose>  
     <br>
    <div class="clear"></div>
    <div id="buttons" style="float: none;">
       <input type="button"    value="반납하기"  onclick="go_return_book()">
       <input type="button" value="도서 목록으로 가기"  onclick="go_book_list()">
     </div>
    </form>
  </article>
<%@ include file="../footer.jsp" %>