<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ include file="./header.jsp" %>
    <!-- MAIN -->
    <main role="main">
      <!-- Main Carousel -->
      <section class="section background-dark">
        <div class="line">
          <div class="carousel-fade-transition owl-carousel carousel-main carousel-nav-white carousel-wide-arrows" >
            <div class="item">
              <div class="s-12 center">
                <img src="./images/book-07.jpg" width="1300" height="463" alt="">
                <div class="carousel-content">
                  <div class="padding-2x">
                    <div class="s-12 m-12 l-8">
                      <p class="text-white text-s-size-20 text-m-size-40 text-l-size-60 margin-bottom-40 text-thin text-line-height-1">Book Management System <br>사이트 입니다 환영합니다</p>  
                    </div>                  
                  </div>
                </div>
              </div>
            </div>
            <div class="item">
              <div class="s-12 center">
                <img src="./images/book-08.jpg" width="1300" height="463" alt="">
                <div class="carousel-content">
                  <div class="padding-2x">
                    <div class="s-12 m-12 l-8">
                      <p class="text-white text-s-size-20 text-m-size-40 text-l-size-60 margin-bottom-40 text-thin text-line-height-1">도서 구매와 대여가 가능한 사이트입니다<br>사이트를 만들었지 뭐야~<br> 빠끄</p>    
                    </div>                  
                  </div>
                </div>
              </div>
            </div>
          </div>  
        </div>
      </section>
      
      <!-- Section 1 -->
      <section class="section background-white">   
        <div class="line">
        
         <h2 class="text-thin headline text-center text-s-size-30 margin-bottom-50">BEST <span class="text-primary">Book</span></h2>
       		<c:set var="size" value="${fn:length(BestBookList)-1}"/>
         	<c:forEach var="i" begin="0" end="${size}" step="3"> 
          <div class="margin">
            <div class="s-12 m-12 l-4 margin-m-bottom">
              <a href="the_book_details?book_code=${BestBookList[i].book_code}"><img class="margin-bottom" src="book_images/${BestBookList[i].image}" alt=""></a>
              <h2 class="text-thin">${BestBookList[i].title}</h2>
                <a href="the_book_details?book_code=${BestBookList[i].book_code}"><b>${BestBookList[i].author}/</b></a>
                <b>${BestBookList[i].publisher}</b>
              <p>${BestBookList[i].content}</p> 
               <p>${BestBookList[i].price }원</p>
               <a class="text-more-info text-primary-hover" href="the_book_details?book_code=${BestBookList[i].book_code}">대출하기</a>                
            </div>
            <div class="s-12 m-12 l-4 margin-m-bottom">
               <a href="the_book_details?book_code=${BestBookList[i+1].book_code}"><img class="margin-bottom" src="book_images/${BestBookList[i+1].image}" alt=""></a>
              <h2 class="text-thin">${BestBookList[i+1].title}</h2>
                <a href="the_book_details?book_code=${BestBookList[i].book_code}"><b>${BestBookList[i+1].author} /</b></a>
              <b>${BestBookList[i+1].publisher}</b>
              <p>${BestBookList[i+1].content}</p> 
              <p>${BestBookList[i+1].price }원</p>
               <a class="text-more-info text-primary-hover" href="the_book_details?book_code=${BestBookList[i].book_code}">대출하기</a>    
            </div>
            <div class="s-12 m-12 l-4 margin-m-bottom">
               <a href="the_book_details?book_code=${BestBookList[i+2].book_code}"><img class="margin-bottom" src="book_images/${BestBookList[i+2].image}" alt=""></a>
              <h2 class="text-thin">${BestBookList[i+2].title}</h2>
               <a href="the_book_details?book_code=${BestBookList[i].book_code}"><b>${BestBookList[i+2].author} /</b></a>
              <b>${BestBookList[i+2].publisher}</b>
              <p>${BestBookList[i+2].content}</p> 
               <p>${BestBookList[i+2].price }원</p>
              <a class="text-more-info text-primary-hover" href="the_book_details?book_code=${BestBookList[i].book_code}">대출하기</a>                
            </div>
          </div>
            </c:forEach>
        </div>
       
      </section>
    
      <!-- Section 4 --> 
      <section class="section background-white">
        <div class="line">
          <h2 class="text-thin headline text-center text-s-size-30 margin-bottom-50">NEW <span class="text-primary">Book</span></h2>
          <div class="carousel-default owl-carousel carousel-wide-arrows">
          
          <c:set var="size" value="${fn:length(newBookList)-1}"/>
          <c:forEach var="i" begin="0" end="${size}" step="3">
            <div class="item">
              <div class="margin" align="center"> 
                <div class="s-12 m-12 l-6">
                  <div class="image-border-radius margin-m-bottom">
                    <div class="margin">
                      <div class="s-12 m-12 l-4 margin-m-bottom">
                        <a class="image-hover-zoom" href="the_book_details?book_code=${newBookList[i].book_code}"><img src="book_images/${newBookList[i].image }"  alt=""></a>
                      </div>
                      <div class="s-12 m-12 l-8 margin-m-bottom">
                        <h3><a class="text-dark text-primary-hover" href="/">${newBookList[i].title}</a></h3>
                        <a href="book_loan?book_code=${newBookList[i].book_code}"><b>${newBookList[i].author} /</b></a>
                         <b>${newBookList[i].publisher}</b>
                        <p>${newBookList[i].content }</p>
                         <p>${newBookList[i].price }원</p>
                        <a class="text-more-info text-primary-hover" href="the_book_details?book_code=${newBookList[i].book_code}">대출하기</a>
                      </div>
                    </div>  
                  </div>
                </div>
                <div class="s-12 m-12 l-6">
                  <div class="image-border-radius">
                    <div class="margin">
                      <div class="s-12 m-12 l-4 margin-m-bottom">
                        <a class="image-hover-zoom" href="the_book_details?book_code=${newBookList[i+1].book_code}"><img src="book_images/${newBookList[i+1].image}"></a>
                      </div>
                      <div class="s-12 m-12 l-8">
                        <h3><a class="text-dark text-primary-hover" href="/">${newBookList[i+1].title }</a></h3>
                        <a href="book_loan?book_code=${newBookList[i+1].book_code}"><b>${newBookList[i+1].author} /</b></a>
                         <b>${newBookList[i+1].publisher}</b>
                        <p>${newBookList[i+1].content }</p>
                        <p>${newBookList[i+1].price }원</p>
                        <a class="text-more-info text-primary-hover" href="the_book_details?book_code=${newBookList[i+1].book_code}">대출하기</a>
                      </div>
                    </div>  
                  </div>
                </div>    
              </div>
            </div> 
		</c:forEach>		
            
          </div>
        </div>    
      </section>
     </main>
     
     <script type="text/javascript" src="js/responsee.js"></script>
    <script type="text/javascript" src="owl-carousel/owl.carousel.js"></script>
    <script type="text/javascript" src="js/template-scripts.js"></script>   
 <%@ include file="./footer.jsp" %>
