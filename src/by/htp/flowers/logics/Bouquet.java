package by.htp.flowers.logics;

import by.htp.flowers.entity.Flower;
import by.htp.flowers.entity.Accessories;

public class Bouquet {
	private Flower[] flowers;
	public Accessories[] accessories;
	protected double bouquetPrice;

	public Bouquet() {

	}

	public Bouquet(Flower[] flowers, Accessories[] accessories) {
		for (int i = 0; i < flowers.length; i++) {
			this.flowers[i] = flowers[i];
		}
		for (int i = 0; i < accessories.length; i++) {
			this.accessories[i] = accessories[i];
		}

		this.bouquetPrice = this.getBouquetPrice();
	}

	private double getBouquetPrice() {
		double sumPrice = 0;
		for (int i = 0; i < flowers.length; i++) {
			sumPrice = sumPrice + flowers[i].getPrice();
		}
		for (int i = 0; i < accessories.length; i++) {
			sumPrice = sumPrice + accessories[i].getPrice();
		}
		return sumPrice;
	}
	
	public void addFlower(Flower[] flowers) {
		this.flowers = new Flower[flowers.length];
		for (int i = 0; i < flowers.length; i++) {
			this.flowers[i] = flowers[i];
		}
	}
	
	public void addAccessory(Accessories[] accessories) {
		this.accessories = new Accessories[accessories.length];
		for (int i = 0; i < accessories.length; i++) {
			this.accessories[i] = accessories[i];
		}
	}

	public void printBouquetPrice() {
		System.out.println("\nThe final bouquet price: " + this.getBouquetPrice());
	}

	public void printBouquet() {
		System.out.println("Flowers in the bouquet:");
		for (int i = 0; i < this.flowers.length; i++) {
			flowers[i].printFlower();
		}
		System.out.println("\nAccessories in the bouquet:");
		for (int i = 0; i < this.accessories.length; i++) {
			accessories[i].printAccessories();
		}
	}

	public void sortBouquetByFreshness() {
		Flower[] tmpFlowers = this.flowers;
		for (int i = 0; i < this.flowers.length; i++) {
			for (int j = 0; j < this.flowers.length - 1; j++) {
				if (tmpFlowers[j].getFreshnessLevel() < tmpFlowers[j + 1].getFreshnessLevel()) {
					Flower tmpFlower = tmpFlowers[j];
					tmpFlowers[j] = tmpFlowers[j + 1];
					tmpFlowers[j + 1] = tmpFlower;
				}
			}
		}
		System.out.println("\nFlowers in the bouqet after sorting by freshness level:");
		for (int i = 0; i < tmpFlowers.length; i++) {
			tmpFlowers[i].printFlower();
		}
	}

	public void findByStemLength(double leftStemLength, double rightStemLength) {
		System.out.println("\nFlower with a stem length between " + leftStemLength + " and " + rightStemLength + ":");
		for (int i = 0; i < this.flowers.length; i++) {
			if (this.flowers[i].getStemLength() > leftStemLength && this.flowers[i].getStemLength() < rightStemLength) {
				flowers[i].printFlower();
			}
		}
	}

}
