package com.model;

public class addMenu {

	private int id;
	private String itemName,Description,Cat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCat() {
		return Cat;
	}
	public void setCat(String cat) {
		Cat = cat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public byte[] getImageItem() {
		return imageItem;
	}
	public void setImageItem(byte[] imageItem) {
		this.imageItem = imageItem;
	}
	private double price;
	private byte imageItem[];
}
