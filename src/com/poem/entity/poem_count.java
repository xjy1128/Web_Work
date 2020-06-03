package com.poem.entity;

public class poem_count {
	private int COUNT_ID;
	private String COUNT_TYPE;
	private int COUNT_ED_ID;
	private int COUNT_LIKE;
	private int COUNT_STAR;
	private int COUNT_READ;
	public poem_count(int cOUNT_ID, String cOUNT_TYPE, int cOUNT_ED_ID, int cOUNT_LIKE, int cOUNT_STAR,
			int cOUNT_READ) {
		super();
		COUNT_ID = cOUNT_ID;
		COUNT_TYPE = cOUNT_TYPE;
		COUNT_ED_ID = cOUNT_ED_ID;
		COUNT_LIKE = cOUNT_LIKE;
		COUNT_STAR = cOUNT_STAR;
		COUNT_READ = cOUNT_READ;
	}
	public int getCOUNT_ID() {
		return COUNT_ID;
	}
	public void setCOUNT_ID(int cOUNT_ID) {
		COUNT_ID = cOUNT_ID;
	}
	public String getCOUNT_TYPE() {
		return COUNT_TYPE;
	}
	public void setCOUNT_TYPE(String cOUNT_TYPE) {
		COUNT_TYPE = cOUNT_TYPE;
	}
	public int getCOUNT_ED_ID() {
		return COUNT_ED_ID;
	}
	public void setCOUNT_ED_ID(int cOUNT_ED_ID) {
		COUNT_ED_ID = cOUNT_ED_ID;
	}
	public int getCOUNT_LIKE() {
		return COUNT_LIKE;
	}
	public void setCOUNT_LIKE(int cOUNT_LIKE) {
		COUNT_LIKE = cOUNT_LIKE;
	}
	public int getCOUNT_STAR() {
		return COUNT_STAR;
	}
	public void setCOUNT_STAR(int cOUNT_STAR) {
		COUNT_STAR = cOUNT_STAR;
	}
	public int getCOUNT_READ() {
		return COUNT_READ;
	}
	public void setCOUNT_READ(int cOUNT_READ) {
		COUNT_READ = cOUNT_READ;
	}
}
