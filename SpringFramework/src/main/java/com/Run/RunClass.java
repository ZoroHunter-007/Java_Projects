package com.Run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Vehical;

public class RunClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Vehical v=(Vehical)context.getBean("vehical");
		System.out.println("Vehical ID:"+v.getVehical_id()+" "+" Vehical Condtion:"+v.getVehical_condition());
		System.out.println("\nBike Details:");
		v.BikeDetails();
		System.out.println("\nCar Details:");
		v.CarDetails();
		
	}
}
