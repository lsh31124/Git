<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel="stylesheet" type="text/css" href="css/member_join.css">
<script src="js/user.js"></script>
</head>
<body>
	<div align="center">
		<h1>join</h1>
		</div>
		<div align="center">
		<form action="member_join" method="POST" name="formm">
			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" name="id" size="20"></td>
					 <td> <input type="hidden"    name="reid">
        			<input type="button"    value="중복 체크"  class="dup" onclick="idcheck()" style="height:30px;"><br><td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pwd" size="20"></td>
				</tr>
				<tr>
					<td>Password_check</td>
					 <td><input type="password"  name="pwdCheck"><td> 
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" size="10"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" size="20"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text"       name="zip_num"   size="25" >
					 <input type="text"        name="addr1"   size="50"></td>
					 <td><input type="text"        name="addr2"   size="15"><br></td>      
        			<td><input type="button"     value="주소 찾기" class="dup" onclick="post_zip()" style="height:30px;"></td>		
				</tr>
				<tr>
					<td>Useryn</td>
					<td>사용자<input type="checkbox" name="useryn"></td>
					<td>관리자<input type="checkbox" name="useryn"></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" size="20"></td>
				</tr>
			</table>
			<br> 
			<input type="button" value="회원가입" class="submit" onclick="go_save()" style="height:30px;">
			&nbsp;&nbsp;&nbsp;
			<input type="reset" value="취소" style="height:30px;">
		</form>
	</div>
</body>
</html>
<%@ include file="../footer.jsp" %>