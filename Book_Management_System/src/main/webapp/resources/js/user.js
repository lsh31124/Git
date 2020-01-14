function go_save() {
  if (document.formm.id.value == "") {
    alert("아이디를 입력하여 주세요.");
    document.formm.id.focus();
  } else if (document.formm.id.value != document.formm.reid.value) {
    alert("중복확인을 클릭하여 주세요.");
    document.formm.id.focus();
  } else if (document.formm.pwd.value == "") {
    alert("비밀번호를 입력해 주세요.");
    document.formm.pwd.focus();
  } else if ((document.formm.pwd.value != document.formm.pwdCheck.value)) {
    alert("비밀번호가 일치하지 않습니다.");
    document.formm.pwd.focus();
  } else if (document.formm.name.value == "") {
    alert("이름을 입력해 주세요.");
    document.formm.name.focus();
  } else if (document.formm.email.value == "") {
    alert("이메일을 입력해 주세요.");
    document.formm.email.focus();
  }else if (document.formm.useryn.value == ""){
	  alert("체크를 해주세요");
  }if($(useryn)){
	  alert("체크 완료!");
  }else if (documetn.formm.phone.value == ""){
	  alert("전화번호를 입력해주세요");
  } else {
    document.formm.action = "member_join";
    document.formm.submit();
  }
}

function idcheck() {
  if (document.formm.id.value == "") {
    alert('아이디를 입력하여 주십시오.');
    document.formm.id.focus();
    return;
  }
  var url = "id_check_form?id=" + document.formm.id.value;
  window.open( url, "_blank_1",
  			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=250");
}

function post_zip() {
  var url = "find_zip_num";
  window.open( url, "_blank_1",
"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=550, height=300, top=300, left=300, ");
}


