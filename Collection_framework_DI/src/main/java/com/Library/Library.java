package com.Library;


public class Library {

	private int libId;
	private String libName;
	
	public Library(int libId,String libName) {
		this.libId=libId;
		this.libName=libName;
	}
	public int getLibId() {
		return libId;
	}
	public void setLibId(int libId) {
		this.libId = libId;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	@Override
	public String toString() {
		return "Library [libId=" + libId + ", libName=" + libName + "]";
	}

	
}
