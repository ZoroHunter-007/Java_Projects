package com.Model;

import java.util.List;

public class Shop {

	private List<Object>list;

	public Shop(List<Object>list) {
		this.list=list;
	}
	
	
	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public void DisplayDetailsData() {
		System.out.println(list);
	}
}
