package com.human.biz.address;

public class AddressVO {
private String zip_num;
private String sido;
private String gugun;
private String dong;
private String zip_code;
private String binji;
public String getZip_num() {
	return zip_num;
}
public void setZip_num(String zip_num) {
	this.zip_num = zip_num;
}

public String getSido() {
	return sido;
}
public void setSido(String sido) {
	this.sido = sido;
}
public String getGugun() {
	return gugun;
}
public void setGugun(String gugun) {
	this.gugun = gugun;
}
public String getDong() {
	return dong;
}
public void setDong(String dong) {
	this.dong = dong;
}
public String getZip_code() {
	return zip_code;
}
public void setZip_code(String zip_code) {
	this.zip_code = zip_code;
}
public String getBinji() {
	return binji;
}
public void setBinji(String binji) {
	this.binji = binji;
}
@Override
public String toString() {
	return "Address [zip_num=" + zip_num + ", sido=" + sido + ", gugun=" + gugun + ", dong=" + dong + ", zip_code="
			+ zip_code + ", binji=" + binji + "]";
}


}
