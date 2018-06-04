package by.htp.flowers.entity;

public class GardenFlower extends Flower{
	
	private String gardenName;
	private double price;
	
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
	

}
