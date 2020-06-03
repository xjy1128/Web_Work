package com.poem.entity;

public class poem_quote {
	private int QUOTE_ID;
	private String QUOTE_CONETNT;
	private String QUOTE_SOURCE;
	private String QUOTE_KEY;
	private String QUOTE_COUNTRY;
	public poem_quote(int qUOTE_ID, String qUOTE_CONETNT, String qUOTE_SOURCE, String qUOTE_KEY, String qUOTE_COUNTRY) {
		super();
		QUOTE_ID = qUOTE_ID;
		QUOTE_CONETNT = qUOTE_CONETNT;
		QUOTE_SOURCE = qUOTE_SOURCE;
		QUOTE_KEY = qUOTE_KEY;
		QUOTE_COUNTRY = qUOTE_COUNTRY;
	}
	public int getQUOTE_ID() {
		return QUOTE_ID;
	}
	public void setQUOTE_ID(int qUOTE_ID) {
		QUOTE_ID = qUOTE_ID;
	}
	public String getQUOTE_CONETNT() {
		return QUOTE_CONETNT;
	}
	public void setQUOTE_CONETNT(String qUOTE_CONETNT) {
		QUOTE_CONETNT = qUOTE_CONETNT;
	}
	public String getQUOTE_SOURCE() {
		return QUOTE_SOURCE;
	}
	public void setQUOTE_SOURCE(String qUOTE_SOURCE) {
		QUOTE_SOURCE = qUOTE_SOURCE;
	}
	public String getQUOTE_KEY() {
		return QUOTE_KEY;
	}
	public void setQUOTE_KEY(String qUOTE_KEY) {
		QUOTE_KEY = qUOTE_KEY;
	}
	public String getQUOTE_COUNTRY() {
		return QUOTE_COUNTRY;
	}
	public void setQUOTE_COUNTRY(String qUOTE_COUNTRY) {
		QUOTE_COUNTRY = qUOTE_COUNTRY;
	}
}
