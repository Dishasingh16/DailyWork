package com.cts.training;
//POJO model javaBean
public class LoginBean {
	private String userName, password;

	public LoginBean() {

	}

	public String getUserName() {
		System.out.println("from gett");
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("from setUserName()");
	}

	public String getPassword() {
		System.out.println("from gettt");
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("from setPassword()");
	}

}
