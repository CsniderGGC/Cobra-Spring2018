package Model;

import java.util.ArrayList;

public class ItemList {
	private ArrayList<Item> itemList;

	private void listOfItems() {
		itemList = new ArrayList<Item>();
		Item babyBlanket = new Item("Baby Blanket", 0, 0, maxHit +5,
				"A small blanket");
		
		Item painMeds = new Item("Pain meds", (maxHP*.1), 0, maxHit +5,
				"Medical pills to re-store health");
		
		Item babyBottle= new Item("Baby Bot-tle", 0, 0, 0,
				"A half-filled baby bottle");
		
		Item hammer = new Item("Hammer", 0, 0, (maxHit + 55),
				"A hefty hammer");
		
		Item broom = new Item("Broom", 0, 0, (maxHit + 10),
				"A normal broom");
		
		Item shovel = new Item("Shovel", 0, 0, (maxHit + 15),
				"A blood splattered shovel");
		
		Item bleach = new Item("Bleach", 0, 0, (maxHit + 10),
				"A full bottle of bleach");
		
		Item holyWater = new Item("Holy Wa-ter", 0, 0, maxHit + 25,
				"A priest�s small vile of holy water");
		
		Item gun = new Item("Gun", 0, 0, maxHit + 35,
				"A loaded gun");
		
		Item taser = new Item("Taser", 0, 0, maxHit + 15,
				"A damaged tase");
		
		Item machete = new Item("Machete", 0, 0, maxHit + 45,
				"A long blade scratched on one side");
		
		Item telephoneLine = new Item("Telephone line", 0, 0, maxHit + 35,
				"A severed line of a telephone");
		
		Item smokeGas = new Item("Smoke Gas", 0, 0, maxHit + 25,
				"Unopen cans of riot smoke gas");
		
		Item pepperSpray = new Item("Pepper spray", 0, 0, maxHit + 15,
				"Dented pepper spray");
		
		Item pizzaCutter = new Item("Pizza Cut-ter", 0, 0, maxHit + 15,
				"A clean pizza cutter");
		
		Item firstAid = new Item("First Aid", (maxHP * .55), 0,  0,
				"An assort-ment of pills, band aids, etc.");
		
		Item onion = new Item("Onion", 0, 0, 0,
				"A normal onion");
		
		Item matches = new Item("Matches", 0, 0, 0,
				"Still usable fire matches");
		
		Item mushroom = new Item("Mushroom", 0, 0, 0,
				"Sliced mushrooms");
		
		Item towel = new Item("Towel", 0, 0, 0,
				"A slightly damp towel");
		
		Item stamp = new Item("Stamp", 0, 0, 0,
				"Am im-portant looking stamp");
		
		Item coin = new Item("Coin", 0, 0, maxHit +5,
				"A disturbing looking coin");
		
		itemList.add(babyBlanket);
		itemList.add(painMeds);
		itemList.add(babyBottle);
		itemList.add(hammer);
		itemList.add(broom);
		itemList.add(shovel);
		itemList.add(bleach);
		itemList.add(holyWater);
		itemList.add(gun);
		itemList.add(taser);
		itemList.add(machete);
		itemList.add(telephoneLine);
		itemList.add(pepperSpray);
		itemList.add(pizzaCutter);
		itemList.add(firstAid);
		itemList.add(onion);
		itemList.add(matches);
		itemList.add(mushroom);
		itemList.add(towel);
		itemList.add(stamp);
		itemList.add(coin);
		
		
		
	}
}