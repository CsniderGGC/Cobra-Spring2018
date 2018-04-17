package Model;

public class MapBuilder {


	public static main void(String []args){
		Room [] map = new Room[32];
		

		map[0] = new Room(String id, String name, String description, Item item, Monster[] monsters, int north,
				int east, int south, int west);
		
		map[1] = new Room("R00", "Player Room","This room contains a bed, tv and night stand next to the window. This is where the player wakes up after surgery and finds out that the hospital has been attacked by zombies while they have been asleep.", Item item, 
				Monster[] monsters, north, south, 0); 
		
		map[2] = new Room("R01", "Patient Room","This room contains twin beds and a tv. One land-line rests in between the two beds. The first bed is empty.The second bed contains an infected patient. Risk trying to call for help or proceed to the next room.", "telephoneLine" , 
				Monster[] monsters, north ,east ,south ,0);
		
		map[3] =  new Room("R02", "Patient Room","You have entered of a pregnant woman sleeping but all the while her zombie baby is awake. You can either wake the mom so she can breast-feed her child to sleep while you try to escape or you can attack both the mom and baby.", Item babyBottle, Item blanket, 
				Monster[] monsters, north ,east ,south ,0 );
		
		map[4] = new Room("R03", "Patient Room", "The shades of the win-dow have been lowered and a dead patient lies in their bed as well as a dead security guard lay-ing on the floor. A bag rests on the table contain-ing numerous items. Player can proceed freely with the option to turn down item or add to their array of items.", "taser", 
				Monster[] monsters, north ,east ,south ,0 );

		map[5] = new Room("R04", "Patient Room", "This room is clean and vacant. Containing one bed, two dressers. No windows and is very dark. Only light coming into the room is from under the door leading to the hallway. However, there are noises coming from the corner. There is a technician in the corner breathing heavily. Must attack technician to pro-ceed.", "infectedTechnician", 
				Monster[] monsters, north ,east ,south ,0 );
		
		map[6] = new Room("R05", "Patient Room", "No furniture in the room. One window letting in the sunset. However, D10 & D11 are locked. A riddle must be completed to proceed.", Puzzle puzzle,  
				Monster[] monsters, north ,east ,south ,0 );
		
		map[7] = new Room("R06", "Patient Room", "This room contains an elderly couple (infected but asleep) with 2 twin beds, two dressers and no window. Room is locked and there appears to be a key next to the elderly woman’s dresser. This key must be obtained to proceed.", Puzzle puzzle, Item key,  
				Monster[] monsters, north ,east ,south ,0);
		
		map[8] = new Room("R07", "Patient Room", "This is another clean room; however, it is vacant with a nurse cart full of supplies. Must give user the option to take health supplies.", Item item 
				Monster[] monsters, north ,east ,south ,0);

		map[9] = new Room("R08", "Patient Room", "This room contains a dead security guard that took his own life. The guard is laying on a twin sized bed with bite marks on his arm and a gun in his hand. Must give play-er the option to add gun to its array of items. ", Item item
				Monster[] monsters, north ,east ,south ,0);

		map[10] = new Room("R09", "Patient Room", "Last patient room contains a little girl sitting on the edge of her bed. Watching the news on the TV mounted on the wall. She is not infected, but too scared to go into the hallway. Only way out is to hold her at gunpoint and sacrifice her to the zombie in the hallway to move to the next room. ", Item item
				Monster[] monsters, 0, east ,south ,0);
 
		map[11] = new Room("R10", "Hallway", "Contains zombies walking up and down the very dim halls. Must move quickly to the next room whenever in the hall-way...", 
				Monster[] monsters, north, east ,south , west);

		map[12] = new Room("R11", "Surgical Room", "This room has a patient on the operation table under multiple operation lights with a heart miss-ing. Must mean there is an infected nurse or doc-tor in the room that ate it. There seems to move-ment in the only dark corner of the room. Must give player option to grab an operating utensil. " Item item, 
				Monster[] monsters, north, east ,0 , 0);
		
		map[13] = new Room("R12", "Surgical Room", "This is room is clean and has not been operated in. It is fully lit and appears to be empty. However, the only door that is open is door D21. Must give option to add health packs to array of items by solving a puzzle/riddle." Item item, 
				Monster[] monsters, 0, east ,south , 0);
		
		map[14] = new Room("R13", "Surgical Room", "This room full of infect nurses knocked out on the floor. With a body missing from the opera-tion table. Give the user the option to take surgical tools off the table and kill them before they wake up. If one wakes up give the user the option to engage in combat or solve the riddle to move forward without their health damaged. " Item item, 
				Monster[] monsters, 0, east ,south , 0);
		
		map[15] = new Room("R14", "Surgical Room", "This room is another clean surgical room. However, it contains a riddle that will grant the player a lantern if they solve the riddle. ", Item item)
				Monster[] monsters, north, east ,south , 0);
		
		map[16] = new Room("R15", "Surgical Room", "This last surgical room contains a patient in fetal position on the metal surgical table. There sur-gical tools sprawled across the floor. The patient attacks." Item item, 
				Monster[] monsters, north, east ,south , west);
		
		map[17] =  new Room("R16", "Women's Bathroom", "There are 7 stalls, one handicap accessible. Blood rests on the walls and the floor in various spots. Water was left running on one of the four sinks. There are no zombies.", Item item,
				Monster[] monsters, north, east ,0 , 0);
		
		map[18] =  new Room("R17", "Men's Bathroom", "There are 2 stalls, one handicap accessible, 3 urinals. Blood rests on the walls and the floor in various spots. Water was left running on one of the four sinks. There are no zombies. If you solve the riddle you will unlock an artifact in the handicap stall. ", Item item; 
				Monster[] monsters, 0, east , south , 0);	
				
		map[19] = new Room("R18", "Physical Therapy" , "There is a wounded/infected therapist pos-ing as a normal person, they try to help but soon after they attack. If you look around you will see a weight station and an area designated for help-ing his patients.", Item item,
				Monster[] monsters north, east , 0 , 0);
		
		map[20] = new Room("R19", "Ultrasound Room" , "This room contains a dead patient lying in the bed that was anxiously awaiting an ultrasound. The ultrasound device is right beside the bed. This room contains absolutely no windows and one ugly painting", Item item,
				Monster[] monsters 0, east , south, 0);
		
		map[21] = new Room("R20", "Library Room" , "Rows and rows filled with high level book-shelves. There are two windows, two exit doors and an area designed for quiet study on top of bean bag chairs.", Item item,
				Monster[] monsters 0, east , south, 0);
		
		map[22] = new Room("R21", "Top Level Stairwell" , "Very dark. If the player earned the lantern they can see the zombie wait-ing for them at the bot-tom of the stairs. If the player does not have a lantern their chances of making it out untouched is 50/50.", Item item,
				Monster[] monsters north, 0, south, 0);
		
		map[23] = new Room("R22", "Lobby" , "There is an empty lobby if flooded with zombies limping around pushing over chairs and vending machines. The en-trance/exit is boarded off. The player must tiptoe to the security desk/office. ", Item item,
				Monster[] monsters north, east, south, west);
		
		map[24] = new Room("R23", "Security" , "You've stumbled upon the hospital’s safe zone. Our security urges to protect and serve the safety of …. Themselves! Check it out if you hope to gain your own protec-tion. ", Item item,
				Monster[] monsters north, 0, south, 0);
		
		map[25] = new Room("R24", "Gift Shop" , " Blood, chips, weapons, tissue, soda, you name it! We got what you want. However, both doors are locked and a riddle must be answered to receive a key.", Item item,
				Monster[] monsters north, 0, south, 0);
		
		map[26] = new Room("R25", "Chapel" , "This room is full of pews and 1 scared patient (un-infected) praying. Hints to why the doors were locked. You may proceed to the cafeteria. However, may solve a riddle for holy water if you choose...", Item item,
				Monster[] monsters 0, south, 0, west);
		
		map[27] = new Room("R26", "Cafe" , "Welcome to the hot cafe! There are two stations, American bistro and piz-za. Aluminum trays hold the food and black cush-ioned chairs hold your butts as you stuff your face.", Item item,
				Monster[] monsters north, 0, south, 0);
		
		map[28] = new Room("R27", "Janitor Closet" , "A small but useful room for proper storage. There's a rack for hang-ing clothes, a rack for cleaning supplies and creme colored lockers for the workers.", Item item,
				Monster[] monsters north, 0, south, 0);
		
		map[29] = new Room("R28", "Lower Level Stairwell" , "This stairwell is well lite with no zombies. There are health packs and weapons on the stairs. The player must choose what items they would like to bring to the final level.", Item item,
				Monster[] monsters north, 0, south, 0);
		
		map[30] = new Room("R29", "Mortuary" , "The mortuary is dim with body drawers amongst the walls. Other than that, it is empty, this may be a trap or it may be a home-run to the exit. As the user tries to move forward or tries to exit the zombies rise from the body drawers all at once at a constant rate", Item item,
				Monster[] monsters north, 0, south, 0);
	}
}

	
	//fileio.write(map);
}

}
