package week06_finalproject;

public class Card {  //creating the framework for the Card.
	
	private int value;  //Private because we want to ask the object to modify using getter/setter
	private String name;
	
	public Card(String name, int value) {
		this.setName(name);
		this.setValue(value);
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public void describe() {
		System.out.println(name);
	}
}