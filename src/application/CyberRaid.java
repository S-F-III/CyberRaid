package application;

import java.util.*;
import application.objects.Character;
import application.objects.DataCenterEvent;
import application.objects.FinalFight;
import application.objects.InternetCafeEvent;
import application.objects.Item;
import application.objects.RipOffEvent;
import application.objects.ScriptKiddieFight;
import application.objects.SmallBusinessEvent;
import application.objects.StartGameEvent;

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
    
    public static void createCharacter(Scanner scnr) {
    	String name;
    	String position = "";
    	String[] rand_names = {"Doc", "Marty", "John", "Jane", "Blendin", "Vinny", "Joel", "Rick", "Morty",
    			"Stupid", "Luke", "Leia", "Han", "Ben", "Arnold", "Elliot", "Gizmo", "Stripe", "Peltzer", "Venkman", "Spengler",
    			"Stantz", "Zeddimore", "Homer", "Marge", "Bart", "Lisa", "Maggie", "Peter", "Brian", "Stewie", "Lois"};
    	int pos_input;
    	boolean pos_chosen = false;
        Random rand = new Random();
    	
    	System.out.println("Greetings, player. What is your name?");
        System.out.println("Type a name or press 'r' to generate a name:");
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
        System.out.println("\nHello, " + name +". Which position do you wish to choose?");
        System.out.println("0 - Cyber Security Officer; 1 - Red Team Specialist; 2 - Cyber Defense Incident Responder");
        while (!pos_chosen) {
        	pos_input = scnr.nextInt();
        	switch (pos_input) {
            	case 0:
	            		System.out.println("You have selected Cyber Security Officer.");
	            		position = positions[0];
	            		pos_chosen = true;
	            		break;
	            case 1:
	            		System.out.println("You have selected Red Flag Specialist.");
	            		position = positions[1];
	            		pos_chosen = true;
	            		break;
	            case 2:
	            		System.out.println("You have selected Cyber Defense Incident Responder.");
	            		position = positions[2];
	            		pos_chosen = true;
	            		break;
	            default:
	            		System.out.println("Invalid choice. Try again.");
        	}
        }
        
        System.out.println("\nYour name is " + name + " and you are a " + position + ".");
        ch = new Character(name, position);
        //scnr.close();
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int decisionCounter;
        int whichWay;
        
        initializeItemTypes();
        createCharacter(scnr);
        while(!gameOver) {
		
	        ch.printStats();
	
	        StartGameEvent.startEvent();
	        StartGameEvent.endEvent();
			
			ScriptKiddieFight.startEvent(); //needs a fight with Script Kiddie
			ScriptKiddieFight.endEvent();
			
			boolean decision = false;
			decisionCounter = 0;
				
			while (!decision || decisionCounter < 3) {
				System.out.println("Will you go to the Data Center or the Small Business?\nPress 1 for Data Center and 2 for the Small Business");
				try {
					whichWay = scnr.nextInt();
				
					switch(whichWay) {
						case 1:
							DataCenterEvent.startEvent();
							DataCenterEvent.endEvent();
							
							SmallBusinessEvent.startEvent();
							SmallBusinessEvent.endEvent();
							
							decision = true;
							break;
						case 2:
							SmallBusinessEvent.startEvent();
							SmallBusinessEvent.endEvent();
							
							DataCenterEvent.startEvent();
							DataCenterEvent.endEvent();
							
							decision = true;
							break;
						default:
							System.out.println("You need to make a different choice");
							decisionCounter++;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			/*if (decisionCounter == 3) { 
				decision = true; 
				gameOver = true;
				System.out.println("You spontaneously die from standing in one place for too long.\nG A M E   O V E R");
			}*/
	
			InternetCafeEvent.startEvent();
			InternetCafeEvent.endEvent();
			
			RipOffEvent.startEvent();
			RipOffEvent.endEvent();
	
			FinalFight.startEvent();
			decision = false;
			decisionCounter = 0;
			while(!decision) {
				System.out.println("Will you follow your destiny?\nPress 1 for yes and 2 for no");
				
				try {
					whichWay = scnr.nextInt();
					if (whichWay == 1) {
						System.out.println("Opening the door you see the former State Actors staring out a large window.\nWithout giving you a chance to speak they turn and fight.");
						decision = true;
					}
					else if (whichWay == 2) {
						System.out.println("The door looms over you as you contemplate life in this decade.\nMaybe it wont be so bad...");
						decision = true;	
						gameOver = true;
					}
					else {
						System.out.println("You need to make a different choice");
						decisionCounter++;
					}
					if (decisionCounter == 3) { 
						decision = true; 
						gameOver = true;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			FinalFight.endEvent();
	        gameOver = true;
	        scnr.close();
        }
    }
}
