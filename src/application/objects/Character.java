package application.objects;

import java.util.*;

public class Character implements Attackable {
	public boolean isDead = false;
	private String name;
	private String position;
	private int level;
	private int offense; //Strength
	private int code_eff; //Dexterity
	private int speed; //Intelligence
	private int experience; //Constitution
	private int confidence; //HP
	private int defense; //Perception
	private int itemBonus; //variable to hold temp item bonus increases
    
	static ArrayList<Item> inventory = new ArrayList<Item>();
	static ArrayList<Skill> skills = new ArrayList<Skill>();
	
	public Character(String name, String position) {
		this.name = name;
		this.position = position;
		this.level = 1;
		generateAttributes();
		initializeInventory();
		initializeSkills();
	}

	private void generateAttributes() {
		if (this.position.equals("Cyber Security Officer")) {
			this.offense = this.code_eff = this.speed = this.experience = this.defense = 6;
			this.confidence = 35;
		}
		else if (this.position.equals("Red Team Specialist")) {
			this.offense = 9;
			this.code_eff = this.experience = 5;
			this.speed = 7;
			this.confidence = 30;
			this.defense = 4;
		}
		else {
			this.offense = this.speed = 4;
			this.code_eff = 6;
			this.experience = 7;
			this.confidence = 40;
			this.defense = 9;
		}
	}
	
	private void initializeInventory() {
    	Item i1 = new Item("Firewall", "Adds +2 to Defense");
    	Item i2 = new Item("Port Scanner", "Adds +2 to Offense");
    	Item i3 = new Item("OpenSource Program", "Adds +2 to Speed");
    	inventory.add(i1);
    	inventory.add(i2);
    	inventory.add(i3);
	}
	
	private void initializeSkills() {
		Skill s1 = new Skill("Threat Intelligence", true);
		Skill s2 = new Skill("Forensics", false);
		Skill s3 = new Skill("Risk Assessment and Management", true);
		Skill s4 = new Skill("Secure Coding Practices", false);
		skills.add(s1);
		skills.add(s2);
		skills.add(s3);
		skills.add(s4);
	}
	@Override
	public boolean receiveDamage(int damage) {
		int bonus;
		if(defense >= 9)
			bonus = 2;
		else if(defense >= 7 && defense < 9)
			bonus = 1;
		else if(defense >= 5 && defense < 7)
			bonus = 0;
		else
			bonus = -1;
		if ((confidence - damage) <= 0) {
			isDead = true;
		}
		else {
			confidence -= damage * (100 - (5 * (defense + bonus)));
		}
		return isDead;
	}
	
	@Override
	public int doDamage(int diceRoll) {
		int bonus;
		if(offense >= 9)
			bonus = 2;
		else if(offense >= 7 && offense < 9)
			bonus = 1;
		else if(offense >= 5 && offense < 7)
			bonus = 0;
		else
			bonus = -1;
		
		int damage = offense + bonus + itemBonus;
		itemBonus = 0;
		 return damage;
	}

	
	public void printStats() {
		System.out.println("\nName: " + name);
		System.out.println("Position: " + position);
		System.out.println("Offense: " + offense);
		System.out.println("Code Efficiency: " + code_eff);
		System.out.println("Speed: " + speed);
		System.out.println("Experience: " + experience);
		System.out.println("Confidence: " + confidence);
		System.out.println("Defense: " + defense);
	}
	
	public void printInventory() {
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getInInventory()) {
				System.out.println(inventory.get(i).getName() + " - " + inventory.get(i).getDescription());
			}
		}
	}
	
	public void printSkills() {
		for (int i = 0; i < skills.size(); i++) {
			if (skills.get(i).getUnlocked()) {
				System.out.print(skills.get(i).getName() + " - ");
				if (skills.get(i).getType()) {
					System.out.print("Offensive [+2 Offense]\n");
				}
				else {
					System.out.print("Defensive [+2 Defense]\n");
				}
			}
		}
	}
	
	public void addItem(int i) {
		if (inventory.get(i).getInInventory()) {
			System.out.println("You already have a " + inventory.get(i).getName() + "!");
		}
		else {
			inventory.get(i).setInInventory(true);
		}
	}
	
	public void useItem(int i) {
		if (!(inventory.get(i).getInInventory())) {
			System.out.println("You do not have a " + inventory.get(i).getName() + "!");
		}
		else {
			inventory.get(i).setInInventory(false);
			if (inventory.get(i).getName().equals("Firewall")) {
				this.defense += 2;
			}
			else if (inventory.get(i).getName().equals("Port Scanner")) {
				this.offense += 2;
			}
			else {
				this.speed += 2;
			}
			System.out.println("Used " + inventory.get(i).getName() + "!");
		}
	}
	
	public void addSkill(int i) {
		if (skills.get(i).getUnlocked()) {
			System.out.println("Skill already obtained!");
		}
		else {
			skills.get(i).setUnlocked(true);
			if (skills.get(i).getType()) {
				this.offense += 2;
			}
			else {
				this.defense += 2;
			}
			System.out.println("-----Obtained Skill \"" + skills.get(i).getName() + "\"!-----");
		}
	}
	
	public void removeSkill(int i) {
		if (!(skills.get(i).getUnlocked())) {
			System.out.println("Skill not acquired!");
		}
		else {
			skills.get(i).setUnlocked(false);
			if (skills.get(i).getType()) {
				this.offense -= 2;
			}
			else {
				this.defense -= 2;
			}
			System.out.println("-----Skill \"" + skills.get(i).getName() + "\" removed!-----");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getOffense() {
		return offense;
	}

	public void setOffense(int offense) {
		this.offense = offense;
	}

	public int getCode_eff() {
		return code_eff;
	}

	public void setCode_eff(int code_eff) {
		this.code_eff = code_eff;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience (int experience) {
		this.experience = experience;
	}

	public int getConfidence() {
		return confidence;
	}

	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
