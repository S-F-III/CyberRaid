package application;

import java.util.*;
import application.objects.Character;
import application.objects.Item;

public class CyberRaid {
	static String positions[] = {"Cyber Security Officer", "Red Team Specialist", "Cyber Defense Incident Responder"};
    static boolean gameOver = false;
    static Character ch;
    static ArrayList<Item> items = new ArrayList<Item>();
    
    private static void initializeItemTypes() {
    	Item i1 = new Item("Firewall", "Adds +2 to Defense");
    	Item i2 = new Item("Port Scanner", "Adds +2 to Offense");
    	Item i3 = new Item("OpenSource Program", "Adds +2 to Speed");
    	items.add(i1);
    	items.add(i2);
    	items.add(i3);
    }
    
    public static void createCharacter() {
    	String name;
    	String position = "";
    	String[] rand_names = {"Doc", "Marty", "John", "Jane", "Blendin", "Vinny", "Joel", "Rick", "Morty",
    			"Stupid", "Luke", "Leia", "Han", "Ben", "Arnold", "Elliot", "Gizmo", "Stripe", "Peltzer", "Venkman", "Spengler",
    			"Stantz", "Zeddimore", "Homer", "Marge", "Bart", "Lisa", "Maggie", "Peter", "Brian", "Stewie", "Lois"};
    	int pos_input;
    	boolean pos_chosen = false;
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
    	
    	Drawable.typeText("Greetings, player. What is your name?");
        Drawable.typeText("Type a name or press 'r' to generate a name:");
        name = scnr.next();
        if (name.equals("r")) {
        	try {
        		int rand_pos = rand.nextInt(rand_names.length);
        		name = rand_names[rand_pos];
        	}
        	catch (IndexOutOfBoundsException e) {
        		e.printStackTrace();
        	}
        }
        Drawable.typeText("\nHello, " + name +". Which position do you wish to choose?");
        Drawable.typeText("0 - Cyber Security Officer; 1 - Red Team Specialist; 2 - Cyber Defense Incident Responder");
        while (!pos_chosen) {
        	pos_input = scnr.nextInt();
        	switch (pos_input) {
            	case 0:
	            		Drawable.typeText("You have selected Cyber Security Officer.");
	            		position = positions[0];
	            		pos_chosen = true;
	            		break;
	            case 1:
	            		Drawable.typeText("You have selected Red Flag Specialist.");
	            		position = positions[1];
	            		pos_chosen = true;
	            		break;
	            case 2:
	            		Drawable.typeText("You have selected Cyber Defense Incident Responder.");
	            		position = positions[2];
	            		pos_chosen = true;
	            		break;
	            default:
	            		Drawable.typeText("Invalid choice. Try again.");
        	}
        }
        
        Drawable.typeText("\nYour name is " + name + " and you are a " + position + ".");
        ch = new Character(name, position);
        scnr.close();
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        
        initializeItemTypes();
        createCharacter();
        while(!gameOver) {
		
        	ch.printStats();

		StartGameEvent.eventStart(); //needs a fight with ATP
		StartGameEvent.eventEnd();
		scriptKiddieEvent.eventStart(); //needs a fight with Script Kiddie
		scriptKiddieEvent.eventEnd();
		bool decision = false
		int decisionCounter = 0
			
		while(!decision) {
			Drawable.typeText("Will you go to the Data Center or the Small Business?\nPress 1 for Data Center and 2 for the Small Business");
			int whichWay = scnr.NextInt();
		
			if(whichWay == 1) {
			DateCenterEvent.startEvent();
			DataCenterEvent.endEvent();
			SmallBusiness.startEvent();
			SmallBusiness.endEvent();
			decision = true;
			}
			else if(whichWay == 2) {
			SmallBusiness.startEvent();
			SmallBusiness.endEvent();
			DateCenterEvent.startEvent();
			DataCenterEvent.endEvent();
			decision = true;
			}
			else {
			Drawable.typeText("You need to make a different choice");
			int decisionCounter++:
			}
			if(decisionCounter == 3) { 
			decision = true; 
			gameOver = true;
			}

		InternetCafeEvent.startEvent();
		InternetCafeEvent.endEvent();
		RipOffEvent.startEvent();
		RipOffEvent.endEvent();

		FinalFight.startEvent();
		decision = false;
		decisionCounter = 0;
		while(!decision){
			Drawable.typeText("Will you follow your destiny?\nPress 1 for yes and 2 for no")
				whichWay = scnr.NextInt();
			if(whichWay == 1){
				Drawable.typeText("Opening the door you see the former State Actors staring out a large window.\nWithout giving you a chance to speak they turn and fight.");
				decision = true;
			}
			else if(whichWay == 2) {
				Drawable.typeText("The door looms over you as you contemplate life in this decade.\nMaybe it wont be so bad...");
				decision = true;	
				gameOver = true;
			}
			else {
			Drawable.typeText("You need to make a different choice");
			int decisionCounter++:
			}
			if(decisionCounter == 3) { 
				decision = true; 
				gameOver = true;
			}
			
		}
		FinalFight.endEvent();
            	gameOver = true;
        }
        
    }

}
