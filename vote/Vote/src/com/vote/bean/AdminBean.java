package com.vote.bean;

public class AdminBean {
	
	private String username;
	private String password;
	private String subpassword;//���û�����
	
	public String getSubpassword() {
		return subpassword;
	}
	public void setSubpassword(String subpassword) {
		this.subpassword = subpassword;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
