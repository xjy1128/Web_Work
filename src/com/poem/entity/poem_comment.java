package com.poem.entity;

public class poem_comment {
	private int COMMENT_ID;
	private String COMMENT_TYPE;
	private int COMMENT_ED_ID;
	private String COMMEN_CONETNT;
	public poem_comment(int cOMMENT_ID, String cOMMENT_TYPE, int cOMMENT_ED_ID, String cOMMEN_CONETNT) {
		super();
		COMMENT_ID = cOMMENT_ID;
		COMMENT_TYPE = cOMMENT_TYPE;
		COMMENT_ED_ID = cOMMENT_ED_ID;
		COMMEN_CONETNT = cOMMEN_CONETNT;
	}
	public int getCOMMENT_ID() {
		return COMMENT_ID;
	}
	public void setCOMMENT_ID(int cOMMENT_ID) {
		COMMENT_ID = cOMMENT_ID;
	}
	public String getCOMMENT_TYPE() {
		return COMMENT_TYPE;
	}
	public void setCOMMENT_TYPE(String cOMMENT_TYPE) {
		COMMENT_TYPE = cOMMENT_TYPE;
	}
	public int getCOMMENT_ED_ID() {
		return COMMENT_ED_ID;
	}
	public void setCOMMENT_ED_ID(int cOMMENT_ED_ID) {
		COMMENT_ED_ID = cOMMENT_ED_ID;
	}
	public String getCOMMEN_CONETNT() {
		return COMMEN_CONETNT;
	}
	public void setCOMMEN_CONETNT(String cOMMEN_CONETNT) {
		COMMEN_CONETNT = cOMMEN_CONETNT;
	}
}
