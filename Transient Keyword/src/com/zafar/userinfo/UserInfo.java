package com.zafar.userinfo;

import java.io.Serializable;

public class UserInfo  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String userId;
	private int age;
	 private transient String password;// by using transient keyword we can ingnore that field to participate in serialization 
	 private transient static String address="New delhi";// static keyword variable will participate in serialization even you use transient keyword or not it will  participate 
	 private transient final String mobileNumber="233211";//it will also participate serialization whether you used transient or not 

	public String getUserId() {
		return userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", age=" + age + ", mobileNumber=" + mobileNumber +"  address="+ address+ "]";
	}

	public UserInfo(String userId, int age, String password) {
		super();
		this.userId = userId;
		this.age = age;
		this.password = password;
	}

	public UserInfo() {
		super();
	}

}
