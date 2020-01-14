function go_cart() {
  if (document.formm.quantity.value == "") {
    alert("수량을 입력하여 주세요.");
    document.formm.quantity.focus();
  } else {
    document.formm.action = "insert_cart";
    document.formm.submit();
  }
}

function search(){
	$(document).on('click','#binSearch',function(e){
		e.preventDefault();
		var url="${search}";
		url=url+"?searchType=" +$('#searchType').val();
		url=url+"&keyword="+$('#keyword').val();
		location.href=url;
		console.log(url);
	});
}

function go_cart_delete() {
  var count = 0;
  for ( var i = 0; i < document.formm.cseq.length; i++) {
    if (document.formm.cseq[i].checked == true) {
      count++;
    }
  }
  if (count == 0) {
    alert("삭제할 항목을 선택해 주세요.");

  } else {
    document.formm.action = "cart_delete";
    document.formm.submit();
  }
}

function go_order_insert() {
  document.formm.action = "order_insert";
  document.formm.submit();
}

function go_order_delete() {
  var count = 0;
  for ( var i = 0; i < document.formm.oseq.length; i++) {
    if (document.formm.oseq[i].checked == true) {
      count++;
    }
  }
  if (count == 0) {
    alert("삭제할 항목을 선택해 주세요.");

  } else {
    document.formm.action = "order_delete";
    document.formm.submit();
  }
}

function go_order() {
  document.formm.action = "mypage";
  document.formm.submit();
}