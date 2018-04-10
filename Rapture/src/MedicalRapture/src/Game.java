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
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, roomPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 120);
	JButton startButton, room1Button, choice1, choice2, choice3, choice4, choice5, choice6;
	Font normal = new Font("Times New Roman", Font.PLAIN, 25);
	Font medium = new Font("Times New Roman", Font.PLAIN, 35);
	Font small = new Font("Times New Roman", Font.PLAIN, 15);
	JTextArea mainTextArea;
	int playerHP,newPlayerHP, monsterHP, playerDamage, monsterDamage, addItem;
	String weapon, position, addWeapon, foundWeapon, foundItem;
	
	public ActionListener choiceHandler, tsHandler;
	
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
		ChoiceHandler choiceHandler = new ChoiceHandler();
		ChoiceHandler rommHandler = new ChoiceHandler();
		
		
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
		mainTextPanel.setBounds(250, 150, 900, 350);
		mainTextPanel.setBackground(Color.BLACK);
		con.add(mainTextPanel);
		
//=========== CHOICE HANDLER ======================================================
		
		ChoiceHandler choiceHandler = new ChoiceHandler();
		
		
		
// ============= PANEL FOR TEXTAREA GAME SCREEN ====================================
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(250, 180, 900, 350);
		mainTextArea.setBackground(Color.RED);
		mainTextArea.setForeground(Color.WHITE);
		mainTextArea.setFont(normal);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		
//===== ROOMS PANNEL ============================================================
	/*	roomPanel = new JPanel();
		roomPanel.setBounds(1200, 250, 50, 20);
		roomPanel.setBackground(Color.YELLOW);
		roomPanel.setLayout(new GridLayout(6,1));
		con.add(roomPanel);
						
	*/
		
		
//================= CHOICE BUTTONS PANEL ===========================================================
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(450, 500, 400, 150);
		choiceButtonPanel.setBackground(Color.BLACK);
		choiceButtonPanel.setLayout(new GridLayout(6,1));
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
		
		choice6 = new JButton(" ");
		choice6.setBackground(Color.BLACK);
		choice6.setForeground(Color.WHITE);
		choice6.setFont(normal);
		choiceButtonPanel.add(choice6);
		choice6.setFocusPainted(false);
		choice6.addActionListener(choiceHandler);
		choice6.setActionCommand("C6");


		
//======= PANEL FOR HP AND WEAPON =========================================
		playerPanel = new JPanel();
		playerPanel.setBounds(250, 50, 900, 50);
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
	
	
//============ PICKUP WEAPON METHOD ===========================================
	
		public void addWeapon() {
			position = "addWeapon";
		//	weapon = weapon + foundWeapon;
			mainTextArea.setText("" + foundWeapon + " added to your Weapon inventory.");
			weaponLabelName.setText(" " + weapon + "," + foundWeapon);
			choice1.setText("Continue");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			choice5.setText("");
			
		}
		
//============ PICKUP ITEM METHOD ===========================================
		
		/*	public void foundItem() {
				position = "foundItem";
				
				mainTextArea.setText("You Found " + foundItem + "\n\nClick Pickup to add item.");
				
				choice1.setText("Pick Up");
				choice2.setText("Go Back");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
				
			}  */
			
//============ ITEM ADDED METHOD ===========================================
			public void addItem() {
				position = "addItem";
				newPlayerHP = playerHP +5;
				mainTextArea.setText("" + foundItem + " added. \nYour HP has been recovered by 5.");
				hpLabelNumber.setText("" + newPlayerHP);
				
				
				choice1.setText("Continue");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
				
				
				
			}
			
			public void addedItem() {
				position = "addedItem";
				mainTextArea.setText("You already added " + foundItem );
				
				choice1.setText("Continue");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				choice5.setText("");
				
				
				
			}
			
	
//============= ATTACK METHODS ================================================
	public void attack() {
		position = "attack";
		mainTextArea.setText(  "\n\n Monster HP: "+ monsterHP + "\n\n\nATTACK or FLEE?");
		choice1.setText("attack");
		choice2.setText("flee");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
	}
	
//============= ATTACK DAMAGE ==========================================================================================
	
	public void playerAttack() {
		position = "playerAttack";
		int playerDamage =0;
		playerDamage = new java.util.Random().nextInt(15);
		
		monsterHP = monsterHP - playerDamage;
		mainTextArea.setText("\nYou attack the monster and gave " + playerDamage+ " damage!"
								+ "\n\nMonster HP: " + monsterHP);
		
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
	
	
//========== WIN AND LOOSE METHODS ===============================================================
	
	public void win() {
		position = "win1";
		mainTextArea.setText("CONGRATULATIONS!!! \nYou killed the monster.");
		choice1.setText("Proceed to Next Room");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
}
	
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
	public void gameReset() {
	playerHP =100;
	monsterHP = 50;
	position = "gameReset";
	mainTextArea.setText("WELCOME TO MEDICAL RAPTURE!!!");
	choice1.setText("Start Game");
	choice2.setText("");
	choice3.setText("");
	choice4.setText("");
	choice5.setText("");
	
	}
	
//======== HALL WAY METHODS ====================================================================================================================
	
		public void roomMenu() {
		position = "roomMenu";
		mainTextArea.setText("Room 1: Patient Room. Clean Bed. One infected patient.  \nRoom 2: Patient Room. Pregnant woman and babie zombie. \nRoom 3: Patient Room \nRoom 4: Patient Room \nRoom 5: Patient Room  ");
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
		
		
		
//========= STARTING ROOM METHOD ===============================================================================================================
	
	public void playerStartingRoom() {
		
		position = "playerStartingRoom";
		mainTextArea.setText("STARTING ROOM: \n\nYou awake after a surgery and find out that the hospital has "
				+ "been attacked by zombies.\n You are in this "
				+ " room that contains a bed, tv and night stand next to the window. \n\n What is your choice?");
		hpLabelNumber.setText("" + playerHP);
		choice1.setText("Go to Next Room");
		choice2.setText("Rooms Menu");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
	}
	
//============ ROOMS METHODS =====================================================================================================================	
	
	
	
	public void room1() {
		position = "room1";
		mainTextArea.setText("ROOM 1: \n\nThis room contains twin beds and a tv. \nOne land-line rests in "
				+ "between the two beds. \nThe first bed is empty. \r\n" + 
				"The second bed contains an infected patient. \nRisk trying to call "
				+ "for help or proceed to the next room. \r\n" );
		
		choice1.setText("Go to Next Room");
		choice2.setText("Go to Previous Room");
		choice3.setText("Rooms Menu");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		
	}
//------------------------------------------------------------------------------------------------------------------------------------	
	public void room2() {
		
		position = "room2";
		mainTextArea.setText("ROOM 2: \n\nYou have entered a room of a pregnant "
				+ "woman. \nShe is sleeping but all the while her zombie baby is awake. "
				+ "\nYou can either wake the mom so she can breast-feed her child to sleep \nwhile you try to escape "
				+ "or you can attack both the mom and baby."
				+ "\n \nENCOUNTER MONSTER!!!" );
		
		choice1.setText("Go to Next Room");
		choice2.setText("Go to Previous Room");
		choice3.setText("Rooms Menu");
		choice4.setText("Examine Monster");
		choice5.setText("");
		choice6.setText("");
		
	}
//-----------------------------------------------------------------------------------------------------------------------------
	
	public void room3() {
		position = "room3";
		mainTextArea.setText("ROOM 3: There are artifacts" );
		
		choice1.setText("Go to Next Room");
		choice2.setText("Go to Previous Room");
		choice3.setText("Rooms Menu");
		choice4.setText("Examine Item");
		choice5.setText("Examine Weapon");
		choice6.setText("");
	
	}
	
//========= MONSTERS ==================================================================
	 
	public void monster1() {
		position = "monster1";
		mainTextArea.setText("Monster HP: " + monsterHP + "\n\nMonster is pregnant zombie and her babie zombie");
		
		choice1.setText("Go Back");
		choice2.setText("Fight Monster");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		
	}
	
//========= ITEMS =====================================================================
	public void item1() {
		
		position = "item1";
		foundItem = "Bottle of water";
		mainTextArea.setText("You found: " + foundItem );
	
		choice1.setText("Pickup");
		choice2.setText("Back to Room");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
	
}
	public void item2() {
	position = "item2";
		foundWeapon = "Knife";
		mainTextArea.setText("You found: " + foundWeapon );
	
		choice1.setText("Pickup");
		choice2.setText("Back to Room");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
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
			case "C1": room1(); break;
			case "C2": roomMenu(); break;
				
			}
			break;
			case "roomMenu":
				switch(yourChoice) {
				case "C1": room1(); break;
				case "C2": room2(); break;
				case "C3": room3(); break;
				case "C4":  break;
				case "C5":  break;
				case "C6":  roomMenu2();break;
				
				}
				break;
			case "roomMenu2":
				switch(yourChoice) {
				case "C1": break;
				case "C2": break;
				case "C3": break;
				case "C4":  break;
				case "C5":  break;
				case "C6":  roomMenu3();break;
				
				}
				break;
				
			case "roomMenu3":
				switch(yourChoice) {
				case "C1":  break;
				case "C2":  break;
				case "C3":  break;
				case "C4":  break;
				case "C5":  break;
				case "C6":  roomMenu4();break;
				
				}
				break;
				
			case "roomMenu4":
				switch(yourChoice) {
				case "C1":  break;
				case "C2":  break;
				case "C3":  break;
				case "C4":  break;
				case "C5":  break;
				case "C6":  roomMenu5();break;
				
				}
				break;
				
			case "roomMenu5":
				switch(yourChoice) {
				case "C1":  break;
				case "C2":  break;
				case "C3":  break;
				case "C4":  break;
				case "C5":  break;
				case "C6":  roomMenu6();break;
				
				}
				break;
				
			case "roomMenu6":
				switch(yourChoice) {
				case "C1":  break;
				case "C2":  break;
				case "C3":  break;
				case "C4":  break;
				case "C5":  break;
				case "C6":  roomMenu();break;
				
				}
				break;
				
				
//=========ROOM CASES ===========================================================
				
			case "room1":
				switch(yourChoice) {
				case "C1" : room2(); break;
				case "C2" : playerStartingRoom(); break;
				case "C3" : roomMenu();break;
				case "C4" : break;
				case "C5" : break;
				case "C6" : break;
				}
				break;
			case "room2":
				switch(yourChoice) {
				case "C1" : room3(); break;
				case "C2" : room1(); break;
				case "C3" : roomMenu(); break;
				case "C4" : monster1();break;
				case "C5" : break;
				case "C6" : break;
				}
				break;
			case "room3":
				switch(yourChoice) {
				case "C1" :  break;
				case "C2" : room2();break;
				case "C3" : roomMenu(); break;
				case "C4" : item1(); break;
				case "C5" : item2(); break;
				case "C6" : break;
				}
				break;
				
//========= ITEM CASES ================================================================================
			case "item1":
				switch(yourChoice) {
				case "C1" : if(playerHP < newPlayerHP) {addedItem();}
				else {addItem();}break;
				case "C2" : room3();break;
				case "C3" : break;
				case "C4" : break;
				case "C5" : break;
				case "C6" : break;
				}
				break;	
				
			case "item2":
				switch(yourChoice) {
				case "C1" : addWeapon(); break;
				case "C2" : room3();break;
				case "C3" : break;
				case "C4" : break;
				case "C5" : break;
				case "C6" : break;
				}
				break;	
				
//========= MONSTER CASES ===============================================================================
				
								
			case "monster1":
				switch(yourChoice) {
				case "C1" : room2(); break;
				case "C2" : attack();break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
//===========  ADD WEAPON CASE ========================================================================				
			case "addWeapon":
				switch(yourChoice) {
				case "C1" : room3(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
//===========  FOUND ITEM CASE ========================================================================					
			
			case "foundItem":
				switch(yourChoice) {
				case "C1" : addItem();
					
				case "C2" : room1(); break;
				
				}
				break;
				
//===========  ADD ITEM CASE ========================================================================	
				
			case "addItem":
				switch(yourChoice) {
				case "C1" : room3(); break;
				case "C2" : break;
				
				}
				break;
				
			case "addedItem":
				switch(yourChoice) {
				case "C1" : room3(); break;
				case "C2" : break;
				
				}
				break;
					
				
//===========  ATTACK CASE ========================================================================	
				
			case "attack":
				switch(yourChoice) {
				
				case "C1" : playerAttack(); break;
				case "C2" : room2();  break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
//===========  PLAYER ATTACK CASE ========================================================================	
				
			case "playerAttack":
				switch(yourChoice) {
				case "C1" : 
					if(monsterHP < 1) {
						win();
						
					}
					else {
					monsterAttack();
					}
				
				 break;
				 
				}
				break;
				
//===========  MONSTER ATTACK CASE ========================================================================	
				
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
				
//============ MONSTER DEAD CASE ==========================================================
			
//===========  WIN CASE ========================================================================	
				
			case "win1":
				switch(yourChoice) {
				case "C1" : room3(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
//===========  LOOSE CASE ========================================================================	
				
			case "loose":
				switch(yourChoice) {
				case "C1" : gameReset(); break;
				case "C2" : break;
				case "C3" : break;
				case "C4" : break;
				}
				break;
				
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
	
}
	

