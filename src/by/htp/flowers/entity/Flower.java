// name, color, stem length
package by.htp.flowers.entity;

public class Flower {
	protected String nameFlower;
	protected String color;
	protected double stemLength;
	protected int freshnessLevel;
	protected double price;
	
	public Flower() {
		
	}
	
	public Flower(String nameFlower, String color, double stemLength, int freshnessLevel) {
		this.nameFlower = nameFlower;
		this.color = color;
		this.stemLength = stemLength;
		this.freshnessLevel = freshnessLevel;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

}
