package com.bitcamp.mvc;

public class Member {
	
	private String uid;
	private String upw;
	private String uname;
	private String photo;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Member [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", photo=" + photo + "]";
	}
	
	

}
