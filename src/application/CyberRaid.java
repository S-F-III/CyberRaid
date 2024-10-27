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
        scnr.close();
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        
        initializeItemTypes();
        createCharacter();
        while(!gameOver) {
        	ch.printStats();
            gameOver = true;
        }
        
    }

}