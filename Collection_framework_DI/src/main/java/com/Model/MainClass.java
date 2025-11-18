package com.Model;

import java.util.List;

public class MainClass {

	
	private List<Object>list;
	
	public MainClass(List<Object>list) {
	
		this.list=list;
	}
	
	
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public void DisplayDetails() {
		System.out.println(list);
	}
}
