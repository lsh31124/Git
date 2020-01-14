function go_cart() {
  if (document.formm.quantity.value == "") {
    alert("수량을 입력하여 주세요.");
    document.formm.quantity.focus();
  } else {
    document.formm.action = "cart_insert";
    document.formm.submit();
  }
}

function go_return_book() {
  var count = 0;

  if (document.formm.rseq.length == undefined) {
    if (document.formm.rseq.checked == true) {
      count++;
    }
  }

  // 체크한 반납도서를 계산
  for ( var i = 0; i < document.formm.rseq.length; i++) {
    //alert("" + document.formm.cseq[i].checked);
    if (document.formm.rseq[i].checked == true) {
      count++;
      //alert("" + count);
    }
  }
  if (count == 0) {
    alert("반납할 도서를 선택해 주세요.");

  } else {
    document.formm.action = "book_return";
    document.formm.submit();
  }
}

function go_order_insert() {
  document.formm.action = "order_insert";
  document.formm.submit();
}



function go_order() {
  document.formm.action = "mypage";
  document.formm.submit();
}

function go_book_list() {
	  var url = "book_list";
	  location.href = url;
	}