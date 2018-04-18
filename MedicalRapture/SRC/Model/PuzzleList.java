package Model;

import java.util.ArrayList;

public class PuzzleList {
	private ArrayList<Puzzle> puzzleList;
	
	private void listOfPuzzles(){
		puzzleList = new ArrayList<Puzzle>();
		
		Puzzle hero = new Puzzle("Hero", "Take off my skin, I won't cry, but you will! What am I?", "Onion", "Vegatable that starts with an o and ends with an n. OxxxN");
		
		Puzzle yummy = new Puzzle("Yummy", "Feed me and I live, yet give me a drink and I die.", "Fire", "The opposite of water. Four Letters.");
		
		Puzzle lookMeUp = new Puzzle("Look Me Up", "Which word in the dictionary is spelled incorrectly?", "Incorrectly","The answer is in the description.");
	
		Puzzle funGuy = new Puzzle ("Fun Guy", "What kind of room has no doors?", "A mushroom", "Starts with m and ends with room. MxxxROOM. You can find this outside on the ground and some you can eat.");
		
		Puzzle well = new Puzzle ("Well", "What gets wetter and wetter the more it dries?", "A towel","Something you use right after you shower to dry yourself.");
		
		Puzzle easyRiddle = new Puzzle("Easy Riddle", "What can travel around the world while staying in a corner?", "A stamp", "You put it on your mail when you need to send it some-where. You can buy it at a post office.");
		
		Puzzle notASnake =  new Puzzle("Not a Snake", "What has a head and a tail, but no body?", "A coin", "You can carry it in your pocket. You flip it and it can land on heads or tails.");
		
		puzzleList.add(hero);
		puzzleList.add(yummy);
		puzzleList.add(lookMeUp);
		puzzleList.add(funGuy);
		puzzleList.add(well);
		puzzleList.add(easyRiddle);
		puzzleList.add(notASnake);
		
	
	}

}
