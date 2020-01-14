<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ include file="../header.jsp"%>
<article>
	<section class="section background-white">
		<div class="line" align="center">
			<h2 class="text-thin headline text-center text-s-size-30 margin-bottom-50">BOOK <span class="text-primary">List</span></h2>
			<c:set var="size" value="${fn:length(bookList)-1}" />
			<c:forEach var="i" begin="0" end="${size}" step="4">
				<div class="margin">
					<div class="s-12 m-12 l-4 margin-m-bottom">
						<a href="the_book_details?book_code=${bookList[i].book_code}"><img
							class="margin-bottom" src="book_images/${bookList[i].image}"
							alt=""></a>
						<h2 class="text-thin">${bookList[i].title}</h2>
						<a href="the_book_details?book_code=${bookList[i].book_code}"><b>${bookList[i].author} /</b></a>
						<b>${bookList[i].publisher}</b>
						<p>${bookList[i].content}</p>
						<p>${bookList[i].price }원</p>
						<a class="text-more-info text-primary-hover"
							href="the_book_details?book_code=${bookList[i].book_code}">대출하기</a>
					</div>
					<div class="s-12 m-12 l-4 margin-m-bottom">
						<a
							href="the_book_details?book_code=${bookList[i+1].book_code}"><img
							class="margin-bottom"
							src="book_images/${bookList[i+1].image}" alt=""></a>
						<h2 class="text-thin">${bookList[i+1].title}</h2>
						<a href="the_book_details?book_code=${bookList[i+1].book_code}"><b>${bookList[i+1].author} /</b></a>
						<b>${bookList[i+1].publisher}</b>
						<p>${bookList[i+1].content}</p>
						<p>${bookList[i+1].price }원</p>
						<a class="text-more-info text-primary-hover"
							href="the_book_details?book_code=${bookList[i+1].book_code}">대출하기</a>
					</div>
					<div class="s-12 m-12 l-4 margin-m-bottom">
						<a
							href="the_book_details?book_code=${bookList[i+2].book_code}"><img
							class="margin-bottom"
							src="book_images/${bookList[i+2].image}" alt=""></a>
						<h2 class="text-thin">${bookList[i+2].title}</h2>
						<a href="the_book_details?book_code=${bookList[i+2].book_code}"><b>${bookList[i+2].author} /</b></a>
						<b>${bookList[i+2].publisher}</b>
						<p>${bookList[i+2].content}</p>
						<p>${bookList[i+2].price }원</p>
						<a class="text-more-info text-primary-hover"
							href="the_book_details?book_code=${bookList[i+2].book_code}">대출하기</a>
					</div>
				</div>
			</c:forEach>
		</div>

	</section>
</article>
<%@ include file="../footer.jsp"%>