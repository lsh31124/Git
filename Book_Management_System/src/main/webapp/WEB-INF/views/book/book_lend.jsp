<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ include file="../header.jsp"%>
<article>
	<section class="section background-white">
		<div class="line" align="center">
			<h2 class="text-thin headline text-center text-s-size-30 margin-bottom-50">도서 <span class="text-primary">대출목록</span></h2>
			<table>
				<tr>
				<td align="center">		
					<c:set var="size" value="${fn:length(bookList)-1}" /> 
						<c:forEach var="i" begin="0" end="${size}" step="3">
							<div class="margin" align="center">
								<div class="s-12 m-12 l-4 margin-m-bottom" align="center">
									<a href="the_book_details?book_code=${bookList[i].book_code}"><img
										class="margin-bottom" src="book_images/${bookList[i].image}"
										alt=""></a>
									<h2 class="text-thin">${bookList[i].title}</h2>
									<a href="the_book_details?book_code=${bookList[i].book_code}"><b>${bookList[i].author}</b></a>
									<b>${bookList[i].publisher}</b>
									<p>${bookList[i].content}</p>
								</div>
							</div>
						</c:forEach>
					</td>
				</tr>
			</table>
		</div>

	</section>
</article>
<%@ include file="../footer.jsp"%>
