package by.htp.flowers.logics;

import by.htp.flowers.entity.Flower;
import by.htp.flowers.entity.Accessories;

public class Bouqet {
	public Flower[] flowers;
	public Accessories[] accessories;
	double bouqetPrice;

	public Bouqet() {

	}

	public Bouqet(Flower[] flowers, Accessories[] accessories) {
		for (int i = 0; i < flowers.length; i++) {
			this.flowers[i] = flowers[i];
		}
		for (int i = 0; i < accessories.length; i++) {
			this.accessories[i] = accessories[i];
		}
	}

	public double getBouqetPrice() {
		double sumPrice = 0;
		for (int i = 0; i < flowers.length; i++) {
			sumPrice = sumPrice + flowers[i].getPrice();
		}
		for (int i = 0; i < accessories.length; i++) {
			sumPrice = sumPrice + accessories[i].getPrice();
		}
		return sumPrice;
	}
	
	public void printBouqet() {
		for (int i = 0; i < this.flowers.length; i++) {
			//here will be print method
		}
	}

}
