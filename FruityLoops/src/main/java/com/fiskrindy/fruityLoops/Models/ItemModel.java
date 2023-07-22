package com.fiskrindy.fruityLoops.Models;

public class ItemModel {

//	Member Variables
	private String name;
	private double price;
		
//	Constructor
	public ItemModel(String name, double price) {
		this.name = name;
		this.price = price;
	}

//	Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
