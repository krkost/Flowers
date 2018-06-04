package by.htp.flowers.entity;

public class PlasticFlower extends Flower{
	
	private String plasticType;
	
	public PlasticFlower() {
	}
	
	public PlasticFlower(String nameFlower, String color, double stemLength, int freshnessLevel, String plasticType, double price) {
		super(nameFlower, color, stemLength, freshnessLevel);
		this.plasticType = plasticType;
		this.price = price;
	}
	
	public String getPlasticType() {
		return plasticType;
	}
	
	public void setPlasticType(String plasticType) {
		this.plasticType = plasticType;
	}
	

}
