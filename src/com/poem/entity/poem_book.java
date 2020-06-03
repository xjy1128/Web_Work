package com.poem.entity;

public class poem_book {
	private int BOOK_ID;
	private String BOOK_NAME;
	private String BOOK_AUTHOR;
	private String BOOK_COUNTRY;
	private String BOOK_RECOMMEND;
	private String BOOK_KEY;
	private String BOOK_COVER;
	public poem_book(int bOOK_ID, String bOOK_NAME, String bOOK_AUTHOR, String bOOK_COUNTRY, String bOOK_RECOMMEND,
			String bOOK_KEY, String bOOK_COVER) {
		super();
		BOOK_ID = bOOK_ID;
		BOOK_NAME = bOOK_NAME;
		BOOK_AUTHOR = bOOK_AUTHOR;
		BOOK_COUNTRY = bOOK_COUNTRY;
		BOOK_RECOMMEND = bOOK_RECOMMEND;
		BOOK_KEY = bOOK_KEY;
		BOOK_COVER = bOOK_COVER;
	}
	public int getBOOK_ID() {
		return BOOK_ID;
	}
	public void setBOOK_ID(int bOOK_ID) {
		BOOK_ID = bOOK_ID;
	}
	public String getBOOK_NAME() {
		return BOOK_NAME;
	}
	public void setBOOK_NAME(String bOOK_NAME) {
		BOOK_NAME = bOOK_NAME;
	}
	public String getBOOK_AUTHOR() {
		return BOOK_AUTHOR;
	}
	public void setBOOK_AUTHOR(String bOOK_AUTHOR) {
		BOOK_AUTHOR = bOOK_AUTHOR;
	}
	public String getBOOK_COUNTRY() {
		return BOOK_COUNTRY;
	}
	public void setBOOK_COUNTRY(String bOOK_COUNTRY) {
		BOOK_COUNTRY = bOOK_COUNTRY;
	}
	public String getBOOK_RECOMMEND() {
		return BOOK_RECOMMEND;
	}
	public void setBOOK_RECOMMEND(String bOOK_RECOMMEND) {
		BOOK_RECOMMEND = bOOK_RECOMMEND;
	}
	public String getBOOK_KEY() {
		return BOOK_KEY;
	}
	public void setBOOK_KEY(String bOOK_KEY) {
		BOOK_KEY = bOOK_KEY;
	}
	public String getBOOK_COVER() {
		return BOOK_COVER;
	}
	public void setBOOK_COVER(String bOOK_COVER) {
		BOOK_COVER = bOOK_COVER;
	}
}
