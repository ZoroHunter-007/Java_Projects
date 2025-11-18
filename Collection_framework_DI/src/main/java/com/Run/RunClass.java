package com.Run;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Generics.generics;
import com.Model.MainClass;
import com.Model.Shop;

public class RunClass {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
	generics g=(generics) a.getBean("generics");
		//g.DisplayList();
		
		
		MainClass m=(MainClass) a.getBean("runclass");
		//m.DisplayDetails();
		
	
		Shop s=(Shop)a.getBean("shop");
		s.DisplayDetailsData();
		
	}
	
	
	
}
