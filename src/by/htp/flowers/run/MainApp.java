/*Flowers. 
 * Define the flowers hierarchy. Create several flower objects. Collect the bouquet (using accessories) with the definition of its cost. 
 * Sort the flowers in the bouquet based by the freshness level. Find the flower in the bouquet, corresponding to the specified range of lengths of stems.
 */

package by.htp.flowers.run;

import by.htp.flowers.entity.Accessories;
import by.htp.flowers.entity.Flower;
import by.htp.flowers.entity.FlowerInPot;
import by.htp.flowers.entity.GardenFlower;
import by.htp.flowers.entity.PlasticFlower;
import by.htp.flowers.logics.Bouquet;

public class MainApp {

	public static void main(String[] args) {
		
		Bouquet bouquet = new Bouquet();
		bouquet.flowers = new Flower[3];
		bouquet.accessories = new Accessories[2];
		
		//(type, color, stemLength, freshnessLevel, childProperty, price)
		FlowerInPot flowerInPot = new FlowerInPot("Rose", "blue", 3.4, 5, "Round", 10);
		GardenFlower gardenFlower = new GardenFlower("Chamomile", "red", 6.4, 6,"Botanical Garden", 20);
		PlasticFlower plasticFlower = new PlasticFlower("Lily", "orange", 2, 10,"Polymer", 15);
		
		//(name, price)
		Accessories accessories1 = new Accessories("Ribbon", 10);
		Accessories accessories2 = new Accessories("Package", 5);
		
		bouquet.flowers[0] = flowerInPot;
		bouquet.flowers[1] = gardenFlower;
		bouquet.flowers[2] = plasticFlower;
		
		bouquet.accessories[0] = accessories1;
		bouquet.accessories[1] = accessories2;
		
		bouquet.printBouquet();
		bouquet.printBouquetPrice();
		bouquet.sortBouquetByFreshness();
		
		double leftStemLength = 6.3;
		double rightStemLength = 6.5;
		
		bouquet.findByStemLength(leftStemLength, rightStemLength);
		
	}

}
