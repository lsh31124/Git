package com.human.user;

public class UserVO {
	private String id;// 사용자아이디
	private String pwd;//사용자 비번
	private String name;// 사용자이름
	private String email; //이메일
	private String address;// 주소
	private String phone;//전화번호
	private String useryb;// 회원여부
	private String authority; //관리자 여부
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUseryb() {
		return useryb;
	}
	public void setUseryb(String useryb) {
		this.useryb = useryb;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phone=" + phone + ", useryb=" + useryb + ", authority=" + authority + "]";
	}
	
	
}
