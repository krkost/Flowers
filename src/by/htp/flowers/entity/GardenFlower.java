package by.htp.flowers.entity;

public class GardenFlower extends Flower{
	
	private String gardenName;

	public GardenFlower() {
		
	}
	
	public GardenFlower(String nameFlower, String color, double stemLength, int freshnessLevel, String gardenName, double price) {
		super(nameFlower, color, stemLength, freshnessLevel);
		this.gardenName = gardenName;
		this.price = price;
	}
	
	public String getGardenName() {
		return gardenName;
	}
	
	public void setGardenName(String gardenName) {
		this.gardenName = gardenName;
	}
	
	public void printFlower() {
		System.out.println("Flower name: " + this.nameFlower + " Color: " + this.color + " Length of stem: "
				+ this.stemLength + " Level of freshness: " + this.freshnessLevel + " Garden Name:"
				+ this.gardenName + " Price: " + this.price);
	}
	

}
