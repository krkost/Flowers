//Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов. Собрать букет (используя аксессуары) с определением его
//стоимости. Провести сортировку цветов в букете на основе уровня свежести. Найти цветок в букете, соответствующий заданному диапазону
//длин стеблей.

package by.htp.flowers.run;

import by.htp.flowers.entity.Accessories;
import by.htp.flowers.entity.Flower;
import by.htp.flowers.entity.FlowerInPot;
import by.htp.flowers.entity.GardenFlower;
import by.htp.flowers.entity.PlasticFlower;
import by.htp.flowers.logics.Bouqet;

public class MainApp {

	public static void main(String[] args) {
		
		//(type, color, stemLength, freshnessLevel, childProperty, price)
		FlowerInPot flowerInPot = new FlowerInPot("Rose", "blue", 3.4, 5, "Round", 5);
		GardenFlower gardenFlower = new GardenFlower("Chamomile", "red", 2, 6,"Botanical Garden", 8);
		PlasticFlower plasticFlower = new PlasticFlower("Lily", "orange", 2, 6,"Polymer", 8);
		
		//(name, price)
		Accessories accessories1 = new Accessories("Ribbon", 4);
		Accessories accessories2 = new Accessories("Package", 5);
		
		Bouqet bouqet = new Bouqet();
		
		bouqet.flowers = new Flower[3];
		bouqet.flowers[0] = flowerInPot;
		bouqet.flowers[1] = gardenFlower;
		bouqet.flowers[2] = plasticFlower;
		
		bouqet.accessories = new Accessories[2];
		
		System.out.println(bouqet.getBouqetPrice());
		
	}

}