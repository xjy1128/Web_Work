package com.poem.entity;

public class poem_poetry {
	private int POEM_ID;
	private String POEM_NAME;
	private String POEM_AUTHOR;
	private String POEM_DYNASTY;
	private String POEM_TYPE;
	private String POEM_STYLE;
	private String POEM_CONTENT;
	private String POEM_TRANSLATE;
	public poem_poetry(int pOEM_ID, String pOEM_NAME, String pOEM_AUTHOR, String pOEM_DYNASTY, String pOEM_TYPE,
			String pOEM_STYLE, String pOEM_CONTENT, String pOEM_TRANSLATE) {
		super();
		POEM_ID = pOEM_ID;
		POEM_NAME = pOEM_NAME;
		POEM_AUTHOR = pOEM_AUTHOR;
		POEM_DYNASTY = pOEM_DYNASTY;
		POEM_TYPE = pOEM_TYPE;
		POEM_STYLE = pOEM_STYLE;
		POEM_CONTENT = pOEM_CONTENT;
		POEM_TRANSLATE = pOEM_TRANSLATE;
	}
	public int getPOEM_ID() {
		return POEM_ID;
	}
	public void setPOEM_ID(int pOEM_ID) {
		POEM_ID = pOEM_ID;
	}
	public String getPOEM_NAME() {
		return POEM_NAME;
	}
	public void setPOEM_NAME(String pOEM_NAME) {
		POEM_NAME = pOEM_NAME;
	}
	public String getPOEM_AUTHOR() {
		return POEM_AUTHOR;
	}
	public void setPOEM_AUTHOR(String pOEM_AUTHOR) {
		POEM_AUTHOR = pOEM_AUTHOR;
	}
	public String getPOEM_DYNASTY() {
		return POEM_DYNASTY;
	}
	public void setPOEM_DYNASTY(String pOEM_DYNASTY) {
		POEM_DYNASTY = pOEM_DYNASTY;
	}
	public String getPOEM_TYPE() {
		return POEM_TYPE;
	}
	public void setPOEM_TYPE(String pOEM_TYPE) {
		POEM_TYPE = pOEM_TYPE;
	}
	public String getPOEM_STYLE() {
		return POEM_STYLE;
	}
	public void setPOEM_STYLE(String pOEM_STYLE) {
		POEM_STYLE = pOEM_STYLE;
	}
	public String getPOEM_CONTENT() {
		return POEM_CONTENT;
	}
	public void setPOEM_CONTENT(String pOEM_CONTENT) {
		POEM_CONTENT = pOEM_CONTENT;
	}
	public String getPOEM_TRANSLATE() {
		return POEM_TRANSLATE;
	}
	public void setPOEM_TRANSLATE(String pOEM_TRANSLATE) {
		POEM_TRANSLATE = pOEM_TRANSLATE;
	}
}
