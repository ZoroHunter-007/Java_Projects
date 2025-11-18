package com.Generics;

import java.util.List;

public class generics {

	private List<Object> list;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public void DisplayList() {
		System.out.println(list);
	}
}
