import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game<choiceButtonPanel> {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, inventoryPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 120);
	JButton startButton, room1Button, choice1, choice2, choice3, choice4, choice5, choice6, choice7, itemButton1, itemButton2, itemButton3, itemButton4, itemButton5, itemButton6, itemButton7;
	Font normal = new Font("Times New Roman", Font.PLAIN, 25);
	Font medium = new Font("Times New Roman", Font.PLAIN, 35);
	Font small = new Font("Times New Roman", Font.PLAIN, 15);
	JTextArea mainTextArea;
	int playerHP,newPlayerHP, monsterHP,monster1HP,monster2HP,monster3HP,monster4HP,monster5HP,monster29HP, playerDamage, monsterDamage, addItem;
	String weapon, position, addWeapon,addWeapon1, addWeapon2, addWeapon3, addWeapon4, addWeapon5, addWeapon6,foundWeapon, foundItem;
	
	public ActionListener choiceHandler, tsHandler, iHandler;
	
	public static void main(String[] args) {
		new Game();
	}

	public Game() {
		
		window = new JFrame();
		window.setSize(1300, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		TitleScreenHandler tsHandler = new TitleScreenHandler();
		
		
		
//========= PANEL FOR TITLE  =====================================================		
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(200, 200, 900, 150);
		titleNamePanel.setBackground(Color.RED);
		titleNameLabel = new JLabel("Medical Rapture");
		titleNameLabel.setForeground(Color.WHITE);
		titleNameLabel.setFont(titleFont);
		
//============ PANEL FOR BUTTONS ==========================================		
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(450, 520, 400, 200);
		startButtonPanel.setBackground(Color.BLACK);
		
//=========== START BUTTON =================================================		
		
		startButton = new JButton("Start");
	
		startButton.setBackground(Color.BLACK);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(medium);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
	//	startButton.setActionCommand(foundItem);
		

		
//=========== CONTAINER =====================================================		
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		
	}
//============= CLASS FOR GAME SCREEN TO DISPLAY TEXT ======================
	
	public void createGameScreen() {
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(250, 90, 900, 350);
		mainTextPanel.setBackground(Color.BLACK);
		con.add(mainTextPanel);
		
//=========== CHOICE HANDLER ======================================================
		
		InventoryHandler iHandler = new InventoryHandler();
		ChoiceHandler choiceHandler = new ChoiceHandler();
		
		
// ============= PANEL FOR TEXTAREA GAME SCREEN ====================================
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(250, 90, 900, 350);
		mainTextArea.setBackground(Color.BLACK);
		mainTextArea.setForeground(Color.WHITE);
		mainTextArea.setFont(normal);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		
//===== INVENTORY PANNEL ============================================================
		
	    
		inventoryPanel = new JPanel();
		inventoryPanel.setBounds(880, 450, 300, 200);
		inventoryPanel.setBackground(Color.BLACK);
		inventoryPanel.setLayout(new GridLayout(7,1));
		con.add(inventoryPanel);
		
		
		itemButton1 = new JButton();
		itemButton1.setBackground(Color.BLACK);
		itemButton1.setForeground(Color.WHITE);
		itemButton1.setFont(normal);
		inventoryPanel.add(itemButton1);
		itemButton1.setFocusPainted(false);
		itemButton1.addActionListener(iHandler);
		itemButton1.setActionCommand("");
		
		itemButton2 = new JButton();
		itemButton2.setBackground(Color.BLACK);
		itemButton2.setForeground(Color.WHITE);
		itemButton2.setFont(normal);
		inventoryPanel.add(itemButton2);
		itemButton2.setFocusPainted(false);
		itemButton2.addActionListener(iHandler);
		itemButton2.setActionCommand("");
		
		itemButton3 = new JButton();
		itemButton3.setBackground(Color.BLACK);
		itemButton3.setForeground(Color.WHITE);
		itemButton3.setFont(normal);
		inventoryPanel.add(itemButton3);
		itemButton3.setFocusPainted(false);
		itemButton3.addActionListener(iHandler);
		itemButton3.setActionCommand("");
		
		itemButton4 = new JButton();
		itemButton4.setBackground(Color.BLACK);
		itemButton4.setForeground(Color.WHITE);
		itemButton4.setFont(normal);
		inventoryPanel.add(itemButton4);
		itemButton4.setFocusPainted(false);
		itemButton4.addActionListener(iHandler);
		itemButton4.setActionCommand("");
		
		itemButton5 = new JButton();
		itemButton5.setBackground(Color.BLACK);
		itemButton5.setForeground(Color.WHITE);
		itemButton5.setFont(normal);
		inventoryPanel.add(itemButton5);
		itemButton5.setFocusPainted(false);
		itemButton5.addActionListener(iHandler);
		itemButton5.setActionCommand("");
		
		itemButton6 = new JButton();
		itemButton6.setBackground(Color.BLACK);
		itemButton6.setForeground(Color.WHITE);
		itemButton6.setFont(normal);
		inventoryPanel.add(itemButton6);
		itemButton6.setFocusPainted(false);
		itemButton6.addActionListener(iHandler);
		itemButton6.setActionCommand("");
		
		itemButton7 = new JButton();
		itemButton7.setBackground(Color.BLACK);
		itemButton7.setForeground(Color.WHITE);
		itemButton7.setFont(normal);
		inventoryPanel.add(itemButton7);
		itemButton7.setFocusPainted(false);
		itemButton7.addActionListener(iHandler);
		itemButton7.setActionCommand("");
		
		inventoryPanel.add(itemButton1);
		inventoryPanel.add(itemButton2);
		inventoryPanel.add(itemButton3);
		inventoryPanel.add(itemButton4);
		inventoryPanel.add(itemButton5);
		inventoryPanel.add(itemButton6);
		inventoryPanel.add(itemButton7);
		
		
		inventoryPanel.setVisible(false);
	
		
//================= CHOICE BUTTONS PANEL ===========================================================
		
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(470, 450, 400, 200);
		choiceButtonPanel.setBackground(Color.BLACK);
		choiceButtonPanel.setLayout(new GridLayout(7,1));
		con.add(choiceButtonPanel);
		
		
		
		
//============ CHOICE BUTTONS ===================================================================		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.BLACK);
		choice1.setForeground(Color.WHITE);
		choice1.setFont(normal);
		choiceButtonPanel.add(choice1);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("C1");
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.BLACK);
		choice2.setForeground(Color.WHITE);
		choice2.setFont(normal);
		choiceButtonPanel.add(choice2);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("C2");

		
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.BLACK);
		choice3.setForeground(Color.WHITE);
		choice3.setFont(normal);
		choiceButtonPanel.add(choice3);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("C3");

		
		choice4 = new JButton("");
		choice4.setBackground(Color.BLACK);
		choice4.setForeground(Color.WHITE);
		choice4.setFont(normal);
		choiceButtonPanel.add(choice4);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("C4");

		
		choice5 = new JButton(" ");
		choice5.setBackground(Color.BLACK);
		choice5.setForeground(Color.WHITE);
		choice5.setFont(normal);
		choiceButtonPanel.add(choice5);
		choice5.setFocusPainted(false);
		choice5.addActionListener(choiceHandler);
		choice5.setActionCommand("C5");
		
		choice6 = new JButton("");
		choice6.setBackground(Color.BLACK);
		choice6.setForeground(Color.WHITE);
		choice6.setFont(normal);
		choiceButtonPanel.add(choice6);
		choice6.setFocusPainted(false);
		choice6.addActionListener(choiceHandler);
		choice6.setActionCommand("C6");
		
		choice7 = new JButton("[ Inventory ]");
		choice7.setBackground(Color.BLUE);
		choice7.setForeground(Color.WHITE);
		choice7.setFont(normal);
		choiceButtonPanel.add(choice7);
		choice7.setFocusPainted(false);
		choice7.addActionListener(choiceHandler);
		choice7.setActionCommand("C7");
		
		
		
//======= PANEL FOR HP AND WEAPON =========================================
		playerPanel = new JPanel();
		playerPanel.setBounds(250, 20, 900, 50);
		playerPanel.setBackground(Color.BLUE);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);

//======= HEALTHPOINT PANEL =====================================================		
		
		hpLabel = new JLabel("HP:");
		hpLabel.setFont(normal);
		hpLabel.setForeground(Color.WHITE);
		playerPanel.add(hpLabel);
		
		hpLabelNumber = new JLabel("");
		hpLabelNumber.setFont(normal);
		hpLabelNumber.setForeground(Color.WHITE);
		playerPanel.add(hpLabelNumber);
		
//======= WEAPON PANEL ==========================================================
		
		weaponLabel = new JLabel("Weapon:");
		weaponLabel.setFont(normal);
		weaponLabel.setForeground(Color.WHITE);
		playerPanel.add(weaponLabel);
		
		weaponLabelName = new JLabel("");
		weaponLabelName.setFont(normal);
		weaponLabelName.setForeground(Color.WHITE);
		playerPanel.add(weaponLabelName);
		
		playerSetup();
		
		
	}
	
	public void playerSetup() {
		playerHP = 100;
		monsterHP = 50;
		
		
		
		weapon = "Bare Hand";
		foundWeapon= "";
		addWeapon = weapon + foundWeapon;
		addItem = 5;
		foundItem ="";
		
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHP);
		weaponLabelName.setText("" + addWeapon);
		

		playerStartingRoom();
	}

	
	public void gameReset() {
	playerHP =100;
	monsterHP = 0;
			;
	position = "gameReset";
	mainTextArea.setText("WELCOME TO MEDICAL RAPTURE!!!");
	choice1.setText("Start Game");
	choice2.setText("");
	choice3.setText("");
	choice4.setText("");
	choice5.setText("");
	
	}
	
	
	//========= STARTING ROOM METHOD ===============================================================================================================
	
		public void playerStartingRoom() {
			playerHP=100;
			position = "playerStartingRoom";
			mainTextArea.setText("STARTING ROOM: \n\nYou awake after a surgery and find out that the hospital has "
					+ "been attacked by zombies.\n You are in this "
					+ " room that contains a bed, tv and night stand next to the window. \n\n What is your choice?");
			//hpLabelNumber.setText("" + playerHP);
			choice1.setText("Examine Room");
			choice2.setText("Map");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			choice6.setText("");
			choice7.setText("");
		}
		
	
public void searchPSR() {
			
			position = "searchPSR";
			mainTextArea.setText("ARTIFACTS: None \r\n"
					+  "\r\n" +  "WEAPON: None \n\nExits: 2 exits \r\n" + 
					"\r\n" + 
					"D00: The other to the hallway (east). \r\n" + 
					"\r\n" + 
					"D01: Leads to the next pa-tient’s room (north).\r\n" + 
					" \r\n" + 
					"Both doors are bulletproof, with bulletproof windows..");
			//hpLabelNumber.setText("" + playerHP);
			choice1.setText("Back to Room");
			choice2.setText("Move East");
			choice3.setText("Move North");
			choice4.setText("");
			choice5.setText("");
			choice6.setText("");
			choice7.setText("");
		}
		
public void hallway() {
	
	position = "hallway";
	mainTextArea.setText("Your Are in Hallway!!!Need to get back to room quickly.");
//	hpLabelNumber.setText("" + playerHP);
	choice1.setText("Back to Room");
	choice2.setText("Map");
	choice3.setText("");
	choice4.setText("");
	choice5.setText("");
	choice6.setText("");
	choice7.setText("");
}
	//=========== ROOM 1 METHODS =================================================
	
	public void room1() {
		
		foundItem ="telephone line";
		position = "room1";
		mainTextArea.setText("ROOM 1: \n\nThis room contains twin beds and a tv. \nOne land-line rests in "
				+ "between the two beds. \nThe first bed is empty. \r\n" + 
				"The second bed contains an infected patient. \nRisk trying to call "
				+ "for help or proceed to the next room. \r\n" );
		
		choice1.setText("Examine Room");
		choice2.setText("Map");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
		
	}
	
	public void hallway1() {
		
		position = "hallway1";
		mainTextArea.setText("Need to get back to room quickly.");
		//hpLabelNumber.setText("" + playerHP);
		choice1.setText("Back to Room");
		choice2.setText("Map");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	}
	
	public void searchRoom1() {
		
		position = "searchRoom1";
		mainTextArea.setText("Artifact: telephone line \r\n "+"\r\n" + "Exits: 3 exits\\r\\n "+"\r\n"+" D01: Leads to the user room (south).\r\n" + 
				"\r\n" + 
				"D02:  Leads to the hallway (east). \r\n" + 
				"\r\n" + 
				"D03: Leads to the next patient’s room (north).");
		//hpLabelNumber.setText("" + playerHP);
		choice1.setText("Move South");
		choice2.setText("Move East");
		choice3.setText("Move North");
		choice4.setText("Examine Artifact");
		choice5.setText("Back to Room");
		choice6.setText("");
		choice7.setText("");
	}
	
	public void room1Item() {
		
		position = "room1Item";
		foundItem = "telephone line";
		mainTextArea.setText("You found: " + foundItem );
	
		choice1.setText("Pickup");
		choice2.setText("Leave");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
	
}
	
	public void addItem1() {
		position = "addItem1";
		playerHP = playerHP + 5;
		
		mainTextArea.setText("" + foundItem + " added. \nYour HP has been recovered by 5.");
		hpLabelNumber.setText("" + playerHP);
		
		
		choice1.setText("Continue");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
	}
		
		public void addedItem1() {
			position = "addedItem1";
			mainTextArea.setText("You already added " + foundItem );
			
			choice1.setText("Continue");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			
			
			
		}

		
//=========== ROOM 2 METHODS =================================================
		
		public void room2() {
			
			//monster1HP = 30;
			position = "room2";
			mainTextArea.setText("ROOM 2: \n\nYou have entered a room of a pregnant "
					+ "woman. \nShe is sleeping but all the while her zombie baby is awake. "
					+ "\nYou can either wake the mom so she can breast-feed her child to sleep \nwhile you try to escape "
					+ "or you can attack both the mom and baby."
					+ "\n \nENCOUNTER MONSTER!!!" );
			

			choice1.setText("Examine Room");
			choice2.setText("Map");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			choice6.setText("");
			choice7.setText("");
			
		}
		
		public void hallway2() {
			//monster1HP = 30;
			position = "hallway2";
			mainTextArea.setText("Need to get back to room quickly.");
			//hpLabelNumber.setText("" + playerHP);
			choice1.setText("Back to Room");
			choice2.setText("Map");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			choice6.setText("");
			choice7.setText("");
		}
		
		public void searchRoom2() {
			//monster1HP = 30;
			position = "searchRoom2";
			mainTextArea.setText("Artifact: baby bottle, blanket (to suffocate)\r\n" + 
					"Monster: zombie baby\r\n" + 
					"Exits: 3 exits\r\n" + 
					"\r\n" + 
					"D03: Leads to the previous patient’s room (south).\r\n" + 
					"\r\n" + 
					"D04: Leads to the hallway (east). \r\n" + 
					"\r\n" + 
					"D05: Leads to the next patient’s room (north).\r\n" + 
					"\r\n" +
					"Doors are bulletproof, w/ bulletproof win-dows....\r\n" );
			//hpLabelNumber.setText("" + playerHP);
			choice1.setText("Move South");
			choice2.setText("Move East");
			choice3.setText("Move North");
			choice4.setText("Examine Artifact");
			choice5.setText("Examine Monster");
			choice6.setText("Back to Room");
			choice7.setText("");
		}
		
		public void room2Item() {
			//monster1HP = 30;
			position = "room2Item";
			foundItem = "baby bottle, blanket ";
			mainTextArea.setText("You found: " + foundItem );
		
			choice1.setText("Pickup");
			choice2.setText("Leave");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			choice6.setText("");
		
	}
		
		public void addItem2() {
			position = "addItem2";
			//monster1HP = 30;
			playerHP = playerHP + 5;
			
			
			mainTextArea.setText("" + foundItem + " added. \nYour HP has been recovered by 5.");
			hpLabelNumber.setText("" + playerHP);
			
			
			choice1.setText("Continue");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
		}
			
			public void addedItem2() {
				//monster1HP = 30;
				position = "addedItem2";
				mainTextArea.setText("You already added " + foundItem );
				
				choice1.setText("Continue");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
				
				
				
			}
			
			
			public void monster1() {
				position = "monster1";
				monster1HP = 30;
				mainTextArea.setText("Monster HP: " + monster1HP + "\n\nMonster is pregnant zombie and her babie zombie");
				
				choice1.setText("Go Back");
				choice2.setText("Fight Monster");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
				
			}
		
			public void attack() {
				monster1HP = 30;
				position = "attack";
				choice1.setText("attack");
				choice2.setText("flee");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
					mainTextArea.setText(  "\n\n Monster HP: "+ monster1HP + "\n\n\nATTACK or FLEE?");
			
			}
			
			public void playerAttack() {
				position = "playerAttack";
				int playerDamage =0;
				playerDamage = new java.util.Random().nextInt(15);
				
				monster1HP = monster1HP - playerDamage;
				mainTextArea.setText("\nYou attack the monster and gave " + playerDamage+ " damage!"
										+ "\n\nMonster HP: " + monster1HP);
				
				choice1.setText("attack again");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
			}
			

			
			public void monsterAttack() {
				position = "monsterAttack";
				int monsterDamage =0;
				monsterDamage = new java.util.Random().nextInt(15);
				mainTextArea.setText("Monster attack you and gave  " + monsterDamage+ " damage!");
				playerHP = playerHP - monsterDamage;
				hpLabelNumber.setText("" + playerHP);
				
				choice1.setText("attack again");
				choice2.setText("flee");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
			}
			
			
			public void monsterDead() {
				position = "monsterDead";
				
				mainTextArea.setText("MONSTER IS DEAD !!!! You have defeated the monster.  " );
				
				
				choice1.setText("Continue");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
			}
			
			public void win() {
				position = "win1";
				mainTextArea.setText("CONGRATULATIONS!!! \nYou killed the monster.");
				choice1.setText("Proceed to Next Room");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
				
		}
	
//============ PICKUP WEAPON METHOD ===========================================
	
		public void addWeapon() {
			position = "addWeapon";
		weapon = weapon + foundWeapon;
			
			mainTextArea.setText("" + foundWeapon + " added to your Weapon inventory.");
			weaponLabelName.setText("" + weapon+ "\n");
			choice1.setText("Continue");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			
		}
		


	
//============= ATTACK METHODS ================================================
	
	
	
	
	
	
//========== WIN AND LOOSE METHODS ===============================================================
	

	
//----------------------------------------------------------------------------------------------------
	public void loose() {
		position = "loose";
		mainTextArea.setText("You are dead!!! \n\n GAME OVER.");
		
		choice1.setText("Play Again");
		choice2.setText("Exit Game");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
		
		
	}
	
//========= GAME RESET SCREEN =====================================
	
	
//======== HALL WAY METHODS ====================================================================================================================
	
		public void roomMenu() {
		position = "roomMenu";
		mainTextArea.setText("Room 1: Patient Room.  \nRoom 2: Patient Room. \nRoom 3: Patient Room \nRoom 4: Patient Room \nRoom 5: Patient Room  ");
		choice1.setText("Room 1");
		choice2.setText("Room 2");
		choice3.setText("Room 3");
		choice4.setText("Room 4");
		choice5.setText("Room 5");
		choice6.setText("Next Page");
	}
		
		public void roomMenu2() {
			position = "roomMenu2";
			mainTextArea.setText("Room 6: \nRoom 7: \nRoom 8: \nRoom 9: \nRoom 10:  ");
			choice1.setText("Room 6");
			choice2.setText("Room 7");
			choice3.setText("Room 8");
			choice4.setText("Room 9");
			choice5.setText("Room 10");
			choice6.setText("Next Page");
		}
			
		public void roomMenu3() {
			position = "roomMenu3";
			mainTextArea.setText("Room 11: \nRoom 12: \nRoom 13: \nRoom 14: \nRoom 15:  ");
			choice1.setText("Room 11");
			choice2.setText("Room 12");
			choice3.setText("Room 13");
			choice4.setText("Room 14");
			choice5.setText("Room 15");
			choice6.setText("Next Page");
		}
		
		public void roomMenu4() {
			position = "roomMenu4";
			mainTextArea.setText("Room 16: \nRoom 17: \nRoom 18: \nRoom 19: \nRoom 20:  ");
			choice1.setText("Room 16");
			choice2.setText("Room 17");
			choice3.setText("Room 18");
			choice4.setText("Room 19");
			choice5.setText("Room 20");
			choice6.setText("Next Page");
		}
		
		public void roomMenu5() {
			position = "roomMenu5";
			mainTextArea.setText("Room 21: \nRoom 22: \nRoom 23: \nRoom 24: \nRoom 25:  ");
			choice1.setText("Room 21");
			choice2.setText("Room 22");
			choice3.setText("Room 23");
			choice4.setText("Room 24");
			choice5.setText("Room 25");
			choice6.setText("Next Page");
		}
		
		
		public void roomMenu6() {
			position = "roomMenu6";
			mainTextArea.setText("Room 26: \nRoom 27: \nRoom 28: \nRoom 29: \nRoom 30:  ");
			choice1.setText("Room 26");
			choice2.setText("Room 27");
			choice3.setText("Room 28");
			choice4.setText("Room 29");
			choice5.setText("Room 30");
			choice6.setText("Rooms Menu");
		}
		
		
//------------------------------------------------------------------------------------------------------------------------------------	
	
//-----------------------------------------------------------------------------------------------------------------------------
	
	public void room3() {
		position = "room3";
		mainTextArea.setText("ROOM 3: \n\nThe shades of the win-dow have been lowered \n\n a dead patient lies in their bed as well as a dead security guard lay-ing on the floor. \n\nA bag rests on the table contain-ing numerous items. \n\nPlayer can proceed freely with the option to turn down item or add to their array of items."
				+ "\n\n ENCOUNTER MONSTER." );
		
		choice1.setText("Search Room");
		choice2.setText("Map");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	
	}
	
	public void hallway3() {
		
		position = "hallway3";
		mainTextArea.setText("You are in hallway. Need to get back to room quickly.");
		//hpLabelNumber.setText("" + playerHP);
		choice1.setText("Back to Room");
		choice2.setText("Map");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	}
	
	public void searchRoom3() {
		
		position = "searchRoom3";
		mainTextArea.setText("Exits: 3 exits\n" + 
				"\n" + 
				"D05: Leads to the previous patient’s room (south).\n" + 
				"\n" + 
				"D06: Leads to the hallway (east). \n" + 
				"\n" + 
				"D07: Leads to the next pa-tient’s room (north).\n" + 
				"\n" + 
				 
				"Doors are bul-letproof, w/ bulletproof windows....\n" + "\n"+
				"THERE ARE MONSTER and ARTIFACTS " );
		//hpLabelNumber.setText("" + playerHP);
		choice1.setText("Move South");
		choice2.setText("Move East");
		choice3.setText("Move North");
		choice4.setText("Examine Artifact");
		choice5.setText("Examine Monster");
		choice6.setText("Back to Room");
		choice7.setText("");
	}
	
	public void room3Item() {
		
		position = "room3Item";
		foundWeapon = "taser ";
		mainTextArea.setText("You found: " + foundWeapon );
	
		choice1.setText("Pickup");
		choice2.setText("Leave");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
	
}
	public void addWeapon1() {
		position = "addWeapon1";
		//foundWeapon = "taser ";
	//	weapon = weapon + foundWeapon;
		mainTextArea.setText("" + foundWeapon + " added to your Weapon inventory.");
		weaponLabelName.setText(" " + weapon + "," + foundWeapon);
		choice1.setText("Continue");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
	}
	
//====================================================================================================================
	public void room4() {
		position = "room4";
		mainTextArea.setText("ROOM 4: \n\nThis room is clean and vacant. Containing one bed, two dressers."
				+ "\nNo windows and is very dark. Only light coming into the room is"
				+ "\nfrom under the door leading to the hallway. "
				+ "\nHowever, there are noises coming from the corner. "
				+ "\nThere is a technician in the corner breathing heavily."
				+ "\n Must attack technician to proceed." );
		
		choice1.setText("Examine Room");
		choice2.setText("Map");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
		
		
	}
	
	
	public void hallway4() {
		
		position = "hallway4";
		mainTextArea.setText("Need to get back to room quickly.");
		//hpLabelNumber.setText("" + playerHP);
		choice1.setText("Back to Room");
		choice2.setText("Map");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	}
	
	public void searchRoom4() {
		
		position = "searchRoom4";
		mainTextArea.setText("Exits: 3 exits\r\n" + 
				"\r\n" + 
				"D07: Leads to the previous patient’s room (south).\r\n" + 
				"\r\n" + 
				"D08:  Leads to the hallway (east). \r\n" + 
				"\r\n" + 
				"D09: Leads to the next pa-tient’s room (north).\r\n" + 
				"\r\n" + 
				"Both \r\n" + 
				"Doors are bul-letproof, w/ bulletproof windows....\r\n" + 
				"" );
		//hpLabelNumber.setText("" + playerHP);
		choice1.setText("Move South");
		choice2.setText("Move East");
		choice3.setText("Move North");
		choice4.setText("Examine Artifact");
		choice5.setText("Examine Monster");
		choice6.setText("Back to Room");
		choice7.setText("");
	}
	
	
	

	public void monster2() {
		position = "monster2";
		monster2HP = 45;
		mainTextArea.setText("Monster HP: " + monster2HP + "\n\ninfected Technician");
		
		choice1.setText("Go Back");
		choice2.setText("Fight Monster");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
	}
	
	public void attack2() {
		monster2HP =45;
		position = "attack2";
		choice1.setText("attack");
		choice2.setText("flee");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
			mainTextArea.setText(  "\n\n Monster HP: "+ monster2HP + "\n\n\nATTACK or FLEE?");
			
	}

	public void player2Attack() {
		//monster2HP =0;
		position = "player2Attack";
		int playerDamage =0;
		playerDamage = new java.util.Random().nextInt(15);
		
		monster2HP = monster2HP - playerDamage;
		mainTextArea.setText("\nYou attack the monster and gave " + playerDamage+ " damage!"
								+ "\n\nMonster HP: " + monster2HP);
		
		choice1.setText("attack again");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
	}
	

	
	public void monster2Attack() {
		//monster2HP =0;
		position = "monster2Attack";
		int monsterDamage =0;
		monsterDamage = new java.util.Random().nextInt(15);
		mainTextArea.setText("Monster attack you and gave  " + monsterDamage+ " damage!");
		playerHP = playerHP - monsterDamage;
		hpLabelNumber.setText("" + playerHP);
		
		choice1.setText("attack again");
		choice2.setText("flee");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
	}
	
	
	public void monster2Dead() {
		
		position = "monsterDead";
		
		mainTextArea.setText("MONSTER IS DEAD !!!! You have defeated the monster.  " );
		
		
		choice1.setText("Continue");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
	}
	
	public void win2() {
		position = "win2";
		mainTextArea.setText("CONGRATULATIONS!!! \nYou killed the monster.");
		choice1.setText("Proceed to Next Room");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
}
	
	public void loose2() {
		position = "loose2";
		mainTextArea.setText("You are dead!!! \n\n GAME OVER.");
		
		choice1.setText("Play Again");
		choice2.setText("Exit Game");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
		
		
	}
//-----------------------------------------------------------------------------------------------------------------------------	
	
	
	
		public void room5() {
			position = "room5";
			mainTextArea.setText("ROOM 5: \n\nNo furniture in the room. One window letting in the sunset. "
					+ "\nHowever, D10 & D11 are locked. "
					+ "\nA riddle must be completed to proceed.." );
			
			choice1.setText("Examine Room");
			choice2.setText("Map");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			choice6.setText("");
			choice7.setText("");
			
			
		}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room6() {
					position = "room6";
					mainTextArea.setText("ROOM 6: \n\nThis room contains an elderly couple (infected but asleep) with 2 twin beds, two dressers and no window."
							+ "\nRoom is locked and there appears to be a key next to the elderly womanâ€™s dresser. "
							+ "\nThis key must be obtained to proceed." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}

//-----------------------------------------------------------------------------------------------------------------------------	
				public void room7() {
					position = "room7";
					mainTextArea.setText("ROOM 7: \n\nThis is another clean room; however, it is va-cant with a nurse cart full of supplies. "
							+ "\nMust give user the option to take health supplies." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
		
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room8() {
					position = "room8";
					mainTextArea.setText("ROOM 8: \n\nThis room contains a dead security guard that took his own life. "
							+ "\nThe guard is laying on a twin sized bed with bite marks on his arm and a gun in his hand. "
							+ "\nMust give play-er the option to add gun to its array of items. " );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}

//-----------------------------------------------------------------------------------------------------------------------------	
				public void room9() {
					position = "room9";
					mainTextArea.setText("ROOM 9: \n\nLast patient room con-tains a little girl sitting on the edge of her bed."
							+ "\nWatching the news on the TV mounted on the wall. She is not infected, but too scared to go into the hallway. "
							+ "\nOnly way out is to hold her at gunpoint and sacrifice her to the zombie in the hallway to move to the next room." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}

//-----------------------------------------------------------------------------------------------------------------------------	
				public void room10() {
					position = "room10";
					mainTextArea.setText("ROOM 10: \n\nContains zombies walk-ing up and down the very dim halls."
							+ "\nMust move quickly to the next room whenever in the hall-way..." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room11() {
					position = "room11";
					mainTextArea.setText("ROOM 11: \n\nThis room has a patient on the operation table under multiple operation lights with a heart miss-ing. "
							+ "\nMust mean there is an infected nurse or doc-tor in the room that ate it. "
							+ "\nThere seems to move-ment in the only dark corner of the room. "
							+ "\nMust give player option to grab an operating utensil. " );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room12() {
					position = "room12";
					mainTextArea.setText("ROOM 12: \n\nThis is room is clean and has not been operated in. "
							+ "\nIt is fully lit and appears to be empty. However, the only door that is open is door D21. "
							+ "\nMust give option to add health packs to array of items by solving a puzzle/riddle." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room13() {
					position = "room13";
					mainTextArea.setText("ROOM 13: \n\nThis room full of infect nurses knocked out on the floor. "
							+ "\nWith a body missing from the opera-tion table. "
							+ "\nGive the user the option to take surgical tools off the table and kill them before they wake up. "
							+ "\nIf one wakes up give the user the option to engage in combat or solve the riddle"
							+ "\n to move forward without their health damaged. " );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room14() {
					position = "room14";
					mainTextArea.setText("ROOM 14: \n\nThis room is another clean surgical room."
							+ "\n However, it contains a riddle that will grant the player a lantern if they solve the riddle.  " );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room15() {
					position = "room15";
					mainTextArea.setText("ROOM 15: \n\nThis last surgical room contains a patient in fetal position on the metal surgical table. "
							+ "\nThere surgical tools sprawled across the floor. The patient attacks." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room16() {
					position = "room16";
					mainTextArea.setText("ROOM 16: \n\nThere are 7 stalls, one handicap accessible. "
							+ "\nBlood rests on the walls and the floor in various spots."
							+ "\n Water was left running on one of the four sinks. There are no zombies." );
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room17() {
					position = "room17";
					mainTextArea.setText("ROOM 17: \n\nThere are 2 stalls, one handicap accessible, 3 urinals. "
							+ "\nBlood rests on the walls and the floor in various spots. "
							+ "\nWater was left running on one of the four sinks. There are no zombies. "
							+ "\nIf you solve the riddle you will unlock an artifact in the handicap stall. " );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room18() {
					position = "room18";
					mainTextArea.setText("ROOM 18: \n\nThere is a wound-ed/infected therapist pos-ing as a normal person, they try to help but soon after they attack. "
							+ "\nIf you look around you will see a weight station and an area designated for help-ing his patients." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room19() {
					position = "room19";
					mainTextArea.setText("ROOM 19: \n\nThis room contains a dead patient lying in the bed that was anxiously awaiting an ultrasound. "
							+ "\nThe ultrasound device is right beside the bed. "
							+ "\nThis room contains absolutely no windows and one ugly painting." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room20() {
					position = "room20";
					mainTextArea.setText("ROOM 20: \n\nRows and rows filled with high level book-shelves. "
							+ "\nThere are two windows, two exit doors and an area designed for quiet study on top of bean bag chairs." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room21() {
					position = "room21";
					mainTextArea.setText("ROOM 21: \n\nVery dark. If the player earned the lantern they can see the zombie wait-ing for them at the bot-tom of the stairs. "
							+ "\nIf the player does not have a lantern their chances of making it out untouched is 50/50." );
					
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room22() {
					position = "room22";
					mainTextArea.setText("ROOM 22: \n\nThere is an empty lobby if flooded with zombies limping around pushing over chairs and vending machines."
							+ "\nThe en-trance/exit is boarded off. The player must tiptoe to the security desk/office. " );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room23() {
					position = "room23";
					mainTextArea.setText("ROOM 23: \n\nYou've stumbled upon the hospitalâ€™s safe zone. "
							+ "\nOur security urges to protect and serve the safety of â€¦. Themselves! "
							+ "\nCheck it out if you hope to gain your own protec-tion. " );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room24() {
					position = "room24";
					mainTextArea.setText("ROOM 24: \n\nBlood, chips, weapons, tissue, soda, you name it! We got what you want. "
							+"\nHowever, both doors are locked and a riddle must be answered to receive a key." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room25() {
					position = "room25";
					mainTextArea.setText("ROOM 25: \n\nThis room is full of pews and 1 scared patient (un-infected) praying. Hints to why the doors were locked. "
							+ "\nYou may proceed to the cafeteria. However, may solve a riddle for holy water if you choose..." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room26() {
					position = "room26";
					mainTextArea.setText("ROOM 26: \n\nWelcome to the hot cafe! There are two stations, American bistro and piz-za. "
							+ "Aluminum trays hold the food and black cush-ioned chairs hold your butts as you stuff your face." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room27() {
					position = "room27";
					mainTextArea.setText("ROOM 27: \n\nA small but useful room for proper storage. "
							+ "\nThere's a rack for hang-ing clothes, a rack for cleaning supplies and creme colored lockers for the workers." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
				
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room28() {
					position = "room28";
					mainTextArea.setText("ROOM 28: \n\nThis stairwell is well lite with no zombies. There are health packs and weapons on the stairs. "
							+ "\nThe player must choose what items they would like to bring to the final level." );
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
				
				
				public void room30() {
					position = "room30";
					mainTextArea.setText("YOU MAY EXIT TO GATE..." );
					
					choice1.setText("You Win Game");
					choice2.setText("");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					
					
				}
//-----------------------------------------------------------------------------------------------------------------------------	
				public void room29() {
					position = "room29";
					mainTextArea.setText("ROOM 29: \n\nThe mortuary is dim with body drawers amongst the walls. Other than that, it is empty, this may be a trap or it may be a home-run to the exit."
							+  "\nAs the user tries to move forward or tries to exit the zombies rise from the body drawers all at once at a constant rate");
					
					choice1.setText("Examine Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
					
					
				}
				
				

				
				
				
				public void hallway29() {
					
					position = "hallway29";
					mainTextArea.setText("Need to get back to room quickly.");
					//hpLabelNumber.setText("" + playerHP);
					choice1.setText("Back to Room");
					choice2.setText("Map");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					choice6.setText("");
					choice7.setText("");
				}
				
				public void searchRoom29() {
					
					position = "searchRoom29";
					mainTextArea.setText("Exits: 2 exits\r\n" + 
							"\r\n" + 
							"D41: Leads to stairwell\r\n" + 
							"\r\n" + 
							"D42: EXIT!\r\n" + 
							"" );
					//hpLabelNumber.setText("" + playerHP);
					choice1.setText("Move South");
					choice2.setText("Move East");
					choice3.setText("Move North");
					choice4.setText("Examine Artifact");
					choice5.setText("Examine Monster");
					choice6.setText("Back to Room");
					choice7.setText("");
				}
				
				public void attack29() {
					position = "attack29";
					choice1.setText("attack");
					choice2.setText("flee");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
						mainTextArea.setText(  "\n\n Monster HP: "+ monster29HP + "\n\n\nATTACK or FLEE?");
				
				}
				

				public void monster29() {
					position = "monster29";
					monster29HP = 50;
					mainTextArea.setText("Monster HP: " + monster29HP + "\n\nall zombies");
					
					choice1.setText("Go Back");
					choice2.setText("Fight Monster");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					
				}

				public void player29Attack() {
					monster29HP = 50;
					position = "player29Attack";
					int playerDamage =0;
					playerDamage = new java.util.Random().nextInt(15);
					
					monster29HP = monster29HP - playerDamage;
					mainTextArea.setText("\nYou attack the monster and gave " + playerDamage+ " damage!"
											+ "\n\nMonster HP: " + monster29HP);
					
					choice1.setText("attack again");
					choice2.setText("");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
				}
				

				
				public void monster29Attack() {
					position = "monster29Attack";
					int monsterDamage =0;
					monsterDamage = new java.util.Random().nextInt(15);
					mainTextArea.setText("Monster attack you and gave  " + monsterDamage+ " damage!");
					playerHP = playerHP - monsterDamage;
					hpLabelNumber.setText("" + playerHP);
					
					choice1.setText("attack again");
					choice2.setText("flee");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
				}
				
				
				public void monster29Dead() {
					position = "monster29Dead";
					
					mainTextArea.setText("MONSTER IS DEAD !!!! You have defeated the monster.   " );
					
					
					choice1.setText("Continue");
					choice2.setText("");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
				}
				
				public void win29() {
					position = "win29";
					mainTextArea.setText("CONGRATULATIONS!!! \nYou killed the monster. \n\nYOU WIN GAME. YOU MAY EXIT TO GATE!!!!");
					choice1.setText("Proceed to Next Room");
					choice2.setText("");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					
			}
				
				public void loose29() {
					position = "loose29";
					mainTextArea.setText("You are dead!!! \n\n GAME OVER.");
					
					choice1.setText("Play Again");
					choice2.setText("Exit Game");
					choice3.setText("");
					choice4.setText("");
					choice5.setText("");
					
					
					
				}
	
//========= MONSTERS ==================================================================
	 
	
	

	public void item2() {
	position = "item2";
		foundWeapon = "Knife";
		mainTextArea.setText("You found: " + foundWeapon );
	
		choice1.setText("Pickup");
		choice2.setText("Back to Room");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
	}
	
	public void item3() {
		position = "item3";
			foundWeapon = "hammer";
			mainTextArea.setText("You found: " + foundWeapon );
		
			choice1.setText("Pickup");
			choice2.setText("Back to Room");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			choice6.setText("");
		}
//========== WEAPONS ==================================================================
	
	
	
//=============== GAME SCREEN ====================================================================================	
	
	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			createGameScreen();
		}
	}
	
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			String yourChoice = event.getActionCommand();
			
		
			switch(position) {
			case "playerStartingRoom":
				switch(yourChoice) {
			case "C1": searchPSR(); break;
			case "C2": roomMenu(); break;
			}	break;
			
			case "searchPSR":
				switch(yourChoice) {
			case "C1": playerStartingRoom(); break;
			case "C2": hallway(); break;
			case "C3": room1(); break;
			}	break;
			
			case "hallway":
				switch(yourChoice) {
			case "C1": room1(); break;
			case "C2": roomMenu(); break;
			}	break;
				
	//==============================================================================================		
			
//==================================================================================================				
				
			case "roomMenu":
				switch(yourChoice) {
				case "C1": room1(); break;
				case "C2": room2(); break;
				case "C3": room3(); break;
				case "C4":  room4(); break;
				case "C5":  room5(); break;
				case "C6":  roomMenu2();break;
				
				}
				break;
			case "roomMenu2":
				switch(yourChoice) {
				case "C1": room6();break;
				case "C2": room7();break;
				case "C3": room8();break;
				case "C4": room9(); break;
				case "C5": room10(); break;
				case "C6":  roomMenu3();break;
				
				}
				break;
				
			case "roomMenu3":
				switch(yourChoice) {
				case "C1": room11(); break;
				case "C2": room12(); break;
				case "C3": room13(); break;
				case "C4": room14(); break;
				case "C5": room15(); break;
				case "C6":  roomMenu4();break;
				
				}
				break;
				
			case "roomMenu4":
				switch(yourChoice) {
				case "C1": room16(); break;
				case "C2": room17(); break;
				case "C3": room18(); break;
				case "C4": room19(); break;
				case "C5": room20(); break;
				case "C6":  roomMenu5();break;
				
				}
				break;
				
			case "roomMenu5":
				switch(yourChoice) {
				case "C1": room21(); break;
				case "C2": room22(); break;
				case "C3": room23(); break;
				case "C4": room24(); break;
				case "C5": room25(); break;
				case "C6":  roomMenu6();break;
				
				}
				break;
				
			case "roomMenu6":
				switch(yourChoice) {
				case "C1": room26(); break;
				case "C2": room27(); break;
				case "C3": room28(); break;
				case "C4":  room29(); break;
				case "C5":  break;
				case "C6":  roomMenu();break;
				
				}
				break;
							
				
//=========ROOM1 CASES ===========================================================
				
			case "room1":
				switch(yourChoice) {
				case "C1" : searchRoom1(); break;
				case "C2" : roomMenu(); break;
				} break;
				
				
			case "searchRoom1":
				switch(yourChoice) {
			case "C1": playerStartingRoom(); break;
			case "C2": hallway(); break;
			case "C3": room2(); break;
			case "C4": room1Item(); break;
			case "C5": room1(); break;
			
			}	break;
			
			case "hallway1":
				switch(yourChoice) {
			case "C1": room1(); break;
			case "C2": roomMenu(); break;
			}	break;	
				
			
			case "room1Item":
				switch(yourChoice) {
				case "C1" : if(playerHP < newPlayerHP) {addedItem1();}
				else {addItem1();}break;
				case "C2" : room1();break;
				}  break;
				
			
			
			case "addItem1":
				switch(yourChoice) {
				case "C1" : room1(); break;
				case "C2" : break;
				} break;
				
			case "addedItem1":
				switch(yourChoice) {
				case "C1" : room1(); break;
				case "C2" : break;
				} break;
					
				
//============= ROOM 2 CASES ==================================================================================
			case "room2":
				switch(yourChoice) {
				case "C1" : searchRoom2(); break;
				case "C2" : roomMenu(); break;
				} break;
				
				
			case "searchRoom2":
				switch(yourChoice) {
			case "C1": room1(); break;
			case "C2": hallway(); break;
			case "C3": room3(); break;
			case "C4": room2Item(); break;
			case "C5": monster1(); break;
			case "C6": room2(); break;
			
			}	break;
			
			case "hallway2":
				switch(yourChoice) {
			case "C1": room2(); break;
			case "C2": roomMenu(); break;
			}	break;	
				
			
			case "room2Item":
				switch(yourChoice) {
				case "C1" : if(playerHP <(playerHP+5)) {addedItem2();}
				else {addItem2();}break;
				case "C2" : room2();break;
				}  break;
				
			
			
			case "addItem2":
				switch(yourChoice) {
				case "C1" : room2(); break;
				case "C2" : break;
				} break;
				
			case "addedItem2":
				switch(yourChoice) {
				case "C1" : room2(); break;
				case "C2" : break;
				} break;
							
			case "monster1":
				switch(yourChoice) {
				case "C1" : room2(); break;
				case "C2" : attack();break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "attack":
				switch(yourChoice) {
				
				case "C1" : playerAttack(); break;
				case "C2" : room2();  break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "playerAttack":
				switch(yourChoice) {
				case "C1" : 
					if(monster1HP < 1) {
						win();
						
					}
					else {
					monsterAttack();
					}
				
				 break;
				 
				}
				break;
				
			case "monsterAttack":
				switch(yourChoice) {
				case "C1" : 
					if(playerHP < 1) {
						loose();
					}
					else {
					playerAttack(); 
					}
					break;
				case "C2": room2(); break;
				}
				break;
				
				
			case "win1":
				switch(yourChoice) {
				case "C1" : room3(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "loose":
				switch(yourChoice) {
				case "C1" : gameReset(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
//===============================================================================================

				
//========== ROOM 3 CASES =====================================================================
			case "room3":
				switch(yourChoice) {
				case "C1" : searchRoom3(); break;
				case "C2" : roomMenu(); break;
				} break;
				
				
			case "searchRoom3":
				switch(yourChoice) {
			case "C1": room2(); break;
			case "C2": hallway3(); break;
			case "C3": room4(); break;
			case "C4": room3Item(); break;
			case "C5": break;
			case "C6": room3(); break;
			
			}	break;
			
			case "hallway3":
				switch(yourChoice) {
			case "C1": room3(); break;
			case "C2": roomMenu(); break;
			}	break;	
				
			
			case "room3Item":
				switch(yourChoice) {
				case "C1" : addWeapon1(); break;
				case "C2" : room3();break;
				}  break;
				
				
			case "addWeapon1":
				switch(yourChoice) {
				case "C1" : searchRoom3(); break;
				case "C2" : break;
				} break;
			
				
				
//=========== ROOM 4 CASES ====================================================================================
				
			case "room4":
				switch(yourChoice) {
				case "C1" : searchRoom4(); break;
				case "C2" : roomMenu(); break;
				} break;
				
				
			case "searchRoom4":
				switch(yourChoice) {
			case "C1": room3(); break;
			case "C2": hallway4(); break;
			case "C3": room4(); break;
			case "C4": room2Item(); break;
			case "C5": monster2(); break;
			case "C6": room2(); break;
			
			}	break;
			
			case "hallway4":
				switch(yourChoice) {
			case "C1": room4(); break;
			case "C2": roomMenu(); break;
			}	break;	
				
			
			
			case "monster2":
				switch(yourChoice) {
				case "C1" : room4(); break;
				case "C2" : attack2();break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "attack2":
				switch(yourChoice) {
				
				case "C1" : player2Attack(); break;
				case "C2" : room4();  break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "player2Attack":
				switch(yourChoice) {
				case "C1" : 
					if(monster2HP < 1) {
						win();
						
					}
					else {
					monster2Attack();
					}
				
				 break;
				 
				}
				break;
				
			case "monster2Attack":
				switch(yourChoice) {
				case "C1" : 
					if(playerHP < 1) {
						loose2();
					}
					else {
					player2Attack(); 
					}
					break;
				case "C2": room4(); break;
				}
				break;
				
				
			case "win2":
				switch(yourChoice) {
				case "C1" : room5(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "loose2":
				switch(yourChoice) {
				case "C1" : gameReset(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
//=========================================================================================================
				
				
//==== ROOM 5 CASES =====================================================================================
			case "5":
				switch(yourChoice) {
				case "C1" :  break;
				case "C2" : roomMenu(); break;
				} break;				
				
//=========================================================================================================
				
				
//==== ROOM 6 CASES =====================================================================================				
			case "room6":
				switch(yourChoice) {
				case "C1" :  break;
				case "C2" : roomMenu(); break;
				} break;		
				
//=========================================================================================================
				
				
//==== ROOM 7 CASES =====================================================================================				
												
				
			case "room7":
				switch(yourChoice) {
				case "C1" :  break;
				case "C2" : roomMenu(); break;
				} break;			
				
//=========================================================================================================
				
				
//==== ROOM 8 CASES =====================================================================================				
																
								
				case "room8":
				switch(yourChoice) {
				case "C1" :  break;
				case "C2" : roomMenu(); break;
				} break;			
				
				
				
				
//==== ROOM 9 CASES =====================================================================================
				
				case "room9":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
				
				
//=========================================================================================================
				
				
//==== ROOM 10 CASES =====================================================================================
				
				case "room10":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
				
				
//=========================================================================================================
				
				
//==== ROOM 11 CASES =====================================================================================
				
				case "room11":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;
//=========================================================================================================
				
				
//==== ROOM 12 CASES =====================================================================================
				case "room12":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;
				
					
//=========================================================================================================
					
					
//==== ROOM 13 CASES =====================================================================================
				case "room13":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;						
//=========================================================================================================
					
					
//==== ROOM 14 CASES =====================================================================================
				case "room14":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;
//=========================================================================================================
					
					
//==== ROOM 15 CASES =====================================================================================
				case "room15":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 16 CASES =====================================================================================
				case "room16":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 17 CASES =====================================================================================
				case "room17":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 18 CASES =====================================================================================
				case "room18":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 19 CASES =====================================================================================
				case "room19":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 20 CASES =====================================================================================
				case "room20":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 21 CASES =====================================================================================
				case "room21":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
				
					
//==== ROOM 22 CASES =====================================================================================
				case "room22":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 23 CASES =====================================================================================
				case "room23":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 24 CASES =====================================================================================
				case "room24":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;	
//=========================================================================================================
					
					
//==== ROOM 25 CASES =====================================================================================
				case "room25":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;		
//=========================================================================================================
					
					
//==== ROOM 26 CASES =====================================================================================
				case "room26":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;		
//=========================================================================================================
					
					
//==== ROOM 27 CASES =====================================================================================
				case "room27":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;		
//=========================================================================================================
					
					
//==== ROOM 28 CASES =====================================================================================
				case "room28":
					switch(yourChoice) {
					case "C1" :  break;
					case "C2" : roomMenu(); break;
					} break;
				
//=========== ROOM 29 CASES ====================================================================================
				
			case "room29":
				switch(yourChoice) {
				case "C1" : searchRoom29(); break;
				case "C2" : roomMenu(); break;
				} break;
				
				
			case "searchRoom29":
				switch(yourChoice) {
			case "C1": room28(); break;
			case "C2": hallway29(); break;
			case "C3":  break;
			case "C4":  break;
			case "C5": monster29(); break;
			case "C6": room29(); break;
			
			}	break;
			
			case "hallway29":
				switch(yourChoice) {
			case "C1": room29(); break;
			case "C2": roomMenu(); break;
			}	break;	
				
			
			
			case "monster29":
				switch(yourChoice) {
				case "C1" : room29(); break;
				case "C2" : attack29();break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "attack29":
				switch(yourChoice) {
				
				case "C1" : player29Attack(); break;
				case "C2" : room29();  break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "player29Attack":
				switch(yourChoice) {
				case "C1" : 
					if(monster29HP < 1) {
						win();
						
					}
					else {
					monster29Attack();
					}
				
				 break;
				 
				}
				break;
				
			case "monster29Attack":
				switch(yourChoice) {
				case "C1" : 
					if(playerHP < 1) {
						loose();
					}
					else {
					player29Attack(); 
					}
					break;
				case "C2": room29(); break;
				}
				break;
				
				
			case "win29":
				switch(yourChoice) {
				case "C1" : room30(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
			case "loose29":
				switch(yourChoice) {
				case "C1" : gameReset(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
				
				
				
				
				
	
//======================================================================================
				
				
			
				//======================================================================================		
				
				
			case "addWeapon":
				switch(yourChoice) {
				case "C1" : room3(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				case "C5" : break;
				case "C6" : break;
				}
				break;
				
//===========  FOUND ITEM CASE ========================================================================					
			
			case "foundItem":
				switch(yourChoice) {
				case "C1" : addItem1(); break;
				case "C2" : room1(); break;
				
				}
				break;
				
//===========  ADD ITEM CASE ========================================================================	
				
		
				
//===========  ATTACK CASE ========================================================================	
				
		
//===========  PLAYER ATTACK CASE ========================================================================	
				
		
				
//===========  MONSTER ATTACK CASE ========================================================================	
				
		
				
//============ MONSTER DEAD CASE ==========================================================
			
//===========  WIN CASE ========================================================================	
				
		
				
//===========  LOOSE CASE ========================================================================	
				
		
				
//===========  GAME RESET CASE ========================================================================	
				
			case "gameReset": 
				switch(yourChoice) {
				case "C1" : playerStartingRoom(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				
				
		}
	
		}
	}
		
		public class InventoryHandler implements ActionListener{
			
			public void actionPerformed(ActionEvent event) {
				String yourChoice = event.getActionCommand();
	
			}
		}
		
	}


	

