 package Model;

import java.util.ArrayList;

public class MonsterList {
	private ArrayList<Monster> monsterList;

	private void listOfMonsters() {
		monsterList = new ArrayList<Monster>();
		Monster babyZombie = new Monster("Baby Zombie", 60, 60, 5,
				"This child appears to be infected. You can see blood on its face");
		Monster nurseZombie = new Monster("Nurse Zombie", 100, 100, 10,
				"They seem to be aimlessly wandering the hall. Their scrubs are soaked in blood.");
		Monster guardZombie = new Monster("Guard Zombie", 200, 200, 20, " ");
		Monster doctorZombie = new Monster("Doctor Zombie", 150, 150, 15, "");
		Monster janitorZombie = new Monster("Janitor Zombie", 100, 100, 10,
				"They're older men and women infected by the virus");
		Monster patientZombie = new Monster("Patient Zombie", 80, 80, 5, "Dead man walking");
		Monster technicianZombie = new Monster("Technician Zombie", 120, 120, 15, "");
		Monster visitorZombie = new Monster("Visitor Zombie", 70, 70, 10, "");
		
		monsterList.add(babyZombie);
		monsterList.add(nurseZombie);
		monsterList.add(guardZombie);
		monsterList.add(doctorZombie);
		monsterList.add(janitorZombie);
		monsterList.add(patientZombie);
		monsterList.add(technicianZombie);
		monsterList.add(visitorZombie);
	}
}