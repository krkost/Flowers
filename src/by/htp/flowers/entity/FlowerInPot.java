package by.htp.flowers.entity;

public class FlowerInPot extends Flower {
	
	String potForm;
	
	public FlowerInPot() {
		
	}
	
	public FlowerInPot(String nameFlower, String color, double stemLength, int freshnessLevel, String  potForm, double price) {
		super(nameFlower, color, stemLength, freshnessLevel);
		this.potForm = potForm;
		this.price = price;
	}
	
	public String getPotForm() {
		return potForm;
	}
	
	public void setPotForm(String potForm) {
		this.potForm = potForm;
	}

}
