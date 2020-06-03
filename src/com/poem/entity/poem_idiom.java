package com.poem.entity;

public class poem_idiom {
	private int IDIOM_ID;
	private String IDIOM_NAME;
	private String IDIOM_SOURCE;
	private String IDIOM_EXAMPLE;
	private String IDIOM_ALPH;
	private String IDIOM_MEAN;
	public poem_idiom(int iDIOM_ID, String iDIOM_NAME, String iDIOM_SOURCE, String iDIOM_EXAMPLE, String iDIOM_ALPH,
			String iDIOM_MEAN) {
		super();
		IDIOM_ID = iDIOM_ID;
		IDIOM_NAME = iDIOM_NAME;
		IDIOM_SOURCE = iDIOM_SOURCE;
		IDIOM_EXAMPLE = iDIOM_EXAMPLE;
		IDIOM_ALPH = iDIOM_ALPH;
		IDIOM_MEAN = iDIOM_MEAN;
	}
	public int getIDIOM_ID() {
		return IDIOM_ID;
	}
	public void setIDIOM_ID(int iDIOM_ID) {
		IDIOM_ID = iDIOM_ID;
	}
	public String getIDIOM_NAME() {
		return IDIOM_NAME;
	}
	public void setIDIOM_NAME(String iDIOM_NAME) {
		IDIOM_NAME = iDIOM_NAME;
	}
	public String getIDIOM_SOURCE() {
		return IDIOM_SOURCE;
	}
	public void setIDIOM_SOURCE(String iDIOM_SOURCE) {
		IDIOM_SOURCE = iDIOM_SOURCE;
	}
	public String getIDIOM_EXAMPLE() {
		return IDIOM_EXAMPLE;
	}
	public void setIDIOM_EXAMPLE(String iDIOM_EXAMPLE) {
		IDIOM_EXAMPLE = iDIOM_EXAMPLE;
	}
	public String getIDIOM_ALPH() {
		return IDIOM_ALPH;
	}
	public void setIDIOM_ALPH(String iDIOM_ALPH) {
		IDIOM_ALPH = iDIOM_ALPH;
	}
	public String getIDIOM_MEAN() {
		return IDIOM_MEAN;
	}
	public void setIDIOM_MEAN(String iDIOM_MEAN) {
		IDIOM_MEAN = iDIOM_MEAN;
	}
}
