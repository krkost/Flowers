package by.htp.flowers.entity;

public class Accessories {
	protected String name;
	protected double price;
	
	public Accessories() {
		
	}
	
	public Accessories(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
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
