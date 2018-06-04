package by.htp.flowers.logics;

import by.htp.flowers.entity.Flower;
import by.htp.flowers.entity.Accessories;

public class Bouqet {
	public Flower[] flowers;
	public Accessories[] accessories;
	protected double bouqetPrice;

	public Bouqet() {

	}

	public Bouqet(Flower[] flowers, Accessories[] accessories) {
		for (int i = 0; i < flowers.length; i++) {
			this.flowers[i] = flowers[i];
		}
		for (int i = 0; i < accessories.length; i++) {
			this.accessories[i] = accessories[i];
		}

		this.bouqetPrice = this.getBouqetPrice();
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

	public void printBouqetPrice() {
		System.out.println("\nThe final bouqet price: " + this.getBouqetPrice());
	}

	public void printBouqet() {
		System.out.println("Flowers in the bouqet:");
		for (int i = 0; i < this.flowers.length; i++) {
			flowers[i].printFlower();
		}
		System.out.println("\nAccessories in the bouqet:");
		for (int i = 0; i < this.accessories.length; i++) {
			accessories[i].printAccessories();
		}
	}

	public void sortBouqetByFreshness () {
		
		Flower[] tmpFlowers = this.flowers;
		for (int i = 0; i < this.flowers.length; i++) {
			for (int j = 0; j < this.flowers.length - 1; j++) {
				if (tmpFlowers[j].getFreshnessLevel() < tmpFlowers[j+1].getFreshnessLevel()) {
					Flower tmpFlower = tmpFlowers[j];
					tmpFlowers[j] = tmpFlowers[j+1];
					tmpFlowers[j+1] = tmpFlower;
				}
			}
		}
		System.out.println("\nFlowers in the bouqet after sorting by freshness level:");
		for (int i = 0; i < tmpFlowers.length; i++) {
			tmpFlowers[i].printFlower();
		}
	}

}
