package com.poem.entity;

public class poem_user {
	private String USER_ID;
	private String USER_PASSWORD;
	private String USER_GENDER;
	private String USER_BIRTHDAY;
	private String USER_EMAIL;
	private String USER_CODE;
	private String USER_AVATAR;
	private String USER_ENTEND;
	private int USER_STATUS;
	public poem_user(String uSER_ID, String uSER_PASSWORD, String uSER_GENDER, String uSER_BIRTHDAY, String uSER_EMAIL,
			String uSER_CODE, String uSER_AVATAR, String uSER_ENTEND, int uSER_STATUS) {
		super();
		USER_ID = uSER_ID;
		USER_PASSWORD = uSER_PASSWORD;
		USER_GENDER = uSER_GENDER;
		USER_BIRTHDAY = uSER_BIRTHDAY;
		USER_EMAIL = uSER_EMAIL;
		USER_CODE = uSER_CODE;
		USER_AVATAR = uSER_AVATAR;
		USER_ENTEND = uSER_ENTEND;
		USER_STATUS = uSER_STATUS;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}
	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}
	public String getUSER_GENDER() {
		return USER_GENDER;
	}
	public void setUSER_GENDER(String uSER_GENDER) {
		USER_GENDER = uSER_GENDER;
	}
	public String getUSER_BIRTHDAY() {
		return USER_BIRTHDAY;
	}
	public void setUSER_BIRTHDAY(String uSER_BIRTHDAY) {
		USER_BIRTHDAY = uSER_BIRTHDAY;
	}
	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}
	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}
	public String getUSER_CODE() {
		return USER_CODE;
	}
	public void setUSER_CODE(String uSER_CODE) {
		USER_CODE = uSER_CODE;
	}
	public String getUSER_AVATAR() {
		return USER_AVATAR;
	}
	public void setUSER_AVATAR(String uSER_AVATAR) {
		USER_AVATAR = uSER_AVATAR;
	}
	public String getUSER_ENTEND() {
		return USER_ENTEND;
	}
	public void setUSER_ENTEND(String uSER_ENTEND) {
		USER_ENTEND = uSER_ENTEND;
	}
	public int getUSER_STATUS() {
		return USER_STATUS;
	}
	public void setUSER_STATUS(int uSER_STATUS) {
		USER_STATUS = uSER_STATUS;
	}	
}
