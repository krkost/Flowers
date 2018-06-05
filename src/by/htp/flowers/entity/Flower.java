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
	
	public int getFreshnessLevel() {
		return freshnessLevel;
	}
	
	public void setFreshnessLevel(int freshnessLevel) {
		this.freshnessLevel = freshnessLevel;
	}
	
	public double getStemLength() {
		return stemLength;
	}
	
	public void setStemLength(double stemLength) {
		this.stemLength = stemLength;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void printFlower() {
		System.out.println("Flower name: " + this.nameFlower + " Color: " + this.color + " Length of stem: "
				+ this.stemLength + " Level of freshness: " + this.freshnessLevel + " Price: " + this.price);
	}

}
