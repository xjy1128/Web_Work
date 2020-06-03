package com.poem.entity;

public class poem_admin {
	private String ADMIN_ID;
	private String ADMIN_PASSWORD;
	private String ADMIN_EMAIL;
	private String ADMIN_CODE;
	private String ADMIN_AVATAR;
	private String ADMIN_ENTEND;
	private int ADMIN_STATUS;
	public poem_admin(String aDMIN_ID, String aDMIN_PASSWORD, String aDMIN_EMAIL, String aDMIN_CODE,
			String aDMIN_AVATAR, String aDMIN_ENTEND, int aDMIN_STATUS) {
		super();
		ADMIN_ID = aDMIN_ID;
		ADMIN_PASSWORD = aDMIN_PASSWORD;
		ADMIN_EMAIL = aDMIN_EMAIL;
		ADMIN_CODE = aDMIN_CODE;
		ADMIN_AVATAR = aDMIN_AVATAR;
		ADMIN_ENTEND = aDMIN_ENTEND;
		ADMIN_STATUS = aDMIN_STATUS;
	}
	public String getADMIN_ID() {
		return ADMIN_ID;
	}
	public void setADMIN_ID(String aDMIN_ID) {
		ADMIN_ID = aDMIN_ID;
	}
	public String getADMIN_PASSWORD() {
		return ADMIN_PASSWORD;
	}
	public void setADMIN_PASSWORD(String aDMIN_PASSWORD) {
		ADMIN_PASSWORD = aDMIN_PASSWORD;
	}
	public String getADMIN_EMAIL() {
		return ADMIN_EMAIL;
	}
	public void setADMIN_EMAIL(String aDMIN_EMAIL) {
		ADMIN_EMAIL = aDMIN_EMAIL;
	}
	public String getADMIN_CODE() {
		return ADMIN_CODE;
	}
	public void setADMIN_CODE(String aDMIN_CODE) {
		ADMIN_CODE = aDMIN_CODE;
	}
	public String getADMIN_AVATAR() {
		return ADMIN_AVATAR;
	}
	public void setADMIN_AVATAR(String aDMIN_AVATAR) {
		ADMIN_AVATAR = aDMIN_AVATAR;
	}
	public String getADMIN_ENTEND() {
		return ADMIN_ENTEND;
	}
	public void setADMIN_ENTEND(String aDMIN_ENTEND) {
		ADMIN_ENTEND = aDMIN_ENTEND;
	}
	public int getADMIN_STATUS() {
		return ADMIN_STATUS;
	}
	public void setADMIN_STATUS(int aDMIN_STATUS) {
		ADMIN_STATUS = aDMIN_STATUS;
	}
}
