package by.htp.flowers.entity;

public class PlasticFlower extends Flower {

	private String plasticType;

	public PlasticFlower() {
	}

	public PlasticFlower(String nameFlower, String color, double stemLength, int freshnessLevel, String plasticType,
			double price) {
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

	public void printFlower() {
		System.out.println("Flower name: " + this.nameFlower + " Color: " + this.color + " Length of stem: "
				+ this.stemLength + " Level of freshness: " + this.freshnessLevel + " Type of plastic:"
				+ this.plasticType + " Price: " + this.price);
	}

}
