package application.objects;
import java.util.*;


public class Enemy implements Attackable {
	
	public boolean isDead = false;
	public int level;
	
	private String name;
    private int offense; //Strength
    private int speed; //Intelligence
    private int confidence; //HP
    private int defense; //Perception
    

	@Override
	public boolean receiveDamage(int damage) {
		 int bonus=0;
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
	    
	    public Enemy(String name, int offense,  int speed,  int confidence, int defense) {
	        this.name = name;
	       
	        this.level = 1;
	        this.offense = offense;
	      
	        this.speed = speed;
	      
	        this.confidence = confidence;
	        this.defense = defense;
	    }
	    public String getName() {
	        return name;
	    }
	   
	   
	    public int getOffense() {
	        return offense;
	    }
	    public void setOffense(int offense) {
	        this.offense = offense;
	    }
	    
	    
	    public int getSpeed() {
	        return speed;
	    }
	    public void setSpeed(int speed) {
	        this.speed = speed;
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