package Day13;

import Day12.Animal;
public class Day13_Inheritance extends Animal {

	private String level;

	public Day13_Inheritance(String type, String name, int num, String level) {
		super(type, name, num);
	    this.level = level;
	}
	
	public Day13_Inheritance(String type, String name, int num) {
		super(type, name, num);
	    this.level = "Be careful if high quantiy it is highly or else less";
	}
	
	public Day13_Inheritance(String type, String name) {
		super(type, name, 0);
	    this.level = "Less";
	}
	public Day13_Inheritance(String type) {
		super(type, "Unidentified creature", 0);
	    this.level = "Less";
	}
	public void tell() {
		System.out.println("The animal identified is " + this.name + ",its a " + this.type + " and there are " + this.num + " in front of me and it is " + this.level + " dangerous.");
	}

}
