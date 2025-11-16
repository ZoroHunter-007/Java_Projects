package com.Model;

public class Vehical {

	private int vehical_id;
	private String vehical_condition;
	private Bike b;
	private Car c;
	
	public int getVehical_id() {
		return vehical_id;
	}
	public void setVehical_id(int vehical_id) {
		this.vehical_id = vehical_id;
	}
	public String getVehical_condition() {
		return vehical_condition;
	}
	public void setVehical_condition(String vehical_condition) {
		this.vehical_condition = vehical_condition;
	}
	public Bike getB() {
		return b;
	}
	public void setB(Bike b) {
		this.b = b;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}
	
	public void BikeDetails() {
		System.out.println("Bike ID:"+b.getBike_id());
		System.out.println("Bike Name:"+b.getBike_name());
		System.out.println("Bike ModelNo:"+b.getBike_modelno());
		System.out.println("Bike Price:"+b.getBike_price());
	}
	
	public void CarDetails() {
		System.out.println("Car ID:"+c.getCar_id());
		System.out.println("Car Name:"+c.getCar_name());
		System.out.println("Car ModelNo:"+c.getCar_model());
		System.out.println("Car Price:"+c.getPrice());
	}
	
}
