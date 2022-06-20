package Day12;

public class Animal {
private String type;
private String name;
private int num;

public Animal (String type, String name, int num) {
	this.name = name;
	this.type = type;
	this.num = num;
}

public void tell () {
	System.out.println("The animal identified is " + this.name + ",its a " + this.type + " and there are " + this.num + " in front of me");
}

}
