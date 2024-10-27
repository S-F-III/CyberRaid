package application.objects;

public class Item {
	private String name;
	private String description;
	private Boolean inInventory;
	
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
		this.inInventory = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getInInventory() {
		return this.inInventory;
	}
	
	public void setInInventory(Boolean inInventory) {
		this.inInventory = inInventory;
	}
	
}
