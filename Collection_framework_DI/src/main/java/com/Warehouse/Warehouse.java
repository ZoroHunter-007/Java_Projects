package com.Warehouse;

public class Warehouse {

	private int warehouseId;
	private String warehouseProduct;
	private double totalAmount;
	
	public Warehouse(int warehouseId,String warehouseProduct,double totalAmount) {
		
		this.warehouseId=warehouseId;
		this.warehouseProduct=warehouseProduct;
		this.totalAmount=totalAmount;
		
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getWarehouseProduct() {
		return warehouseProduct;
	}
	public void setWarehouseProduct(String warehouseProduct) {
		this.warehouseProduct = warehouseProduct;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Warehouse [Warehouse ID=" + warehouseId + ", Warehouse ProductName=" + warehouseProduct + ", TotalAmount="
				+ totalAmount + "]";
	}
	
	
}
