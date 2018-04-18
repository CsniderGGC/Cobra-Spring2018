package Model;

import java.util.ArrayList;

public class PuzzleList {
	private ArrayList<Puzzle> puzzleList;
	
	private void listOfPuzzles(){
		puzzleList = new ArrayList<Puzzle>();
		
		Puzzle hero = new Puzzle("Hero", "Take off my skin, I won't cry, but you will! What am I?", "Onion", "Vegatable that starts with an o and ends with an n. OxxxN");
		
		Puzzle yummy = new Puzzle("Yummy", "Feed me and I live, yet give me a drink and I die.", "Fire", "The opposite of water. Four Letters.");
		
		Puzzle lookMeUp = new Puzzle("Look Me Up", "Which word in the dictionary is spelled incorrectly?", "Incorrectly","The answer is in the description.");
	
		
	
	}

}
