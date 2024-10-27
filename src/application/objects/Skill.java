package application.objects;

public class Skill {
	private String name;
	private Boolean type; //offense: TRUE; defense: FALSE
	private Boolean unlocked; //unlocked: TRUE; locked: FALSE
	
	public Skill(String name, Boolean type) {
		this.name = name;
		this.type = type;
		this.unlocked = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getType() {
		return type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}
	
	public Boolean getUnlocked() {
		return this.unlocked;
	}
	
	public void setUnlocked(Boolean unlocked) {
		this.unlocked = unlocked;
	}
	
}
