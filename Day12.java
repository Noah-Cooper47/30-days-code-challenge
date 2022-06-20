package Day12;

public class Day12 {

	public static void main(String[] args) {
	Animal lion = new Animal ("Carnivore", "Lion", 4);
	lion.tell();
	Animal tiger = new Animal ("Carnivore", "Tiger", 7);
	tiger.tell();
	Animal Wolf = new Animal ("Carnivore", "Wolf", 8);
	Wolf.tell();
	Animal goat = new Animal ("Herbivore", "Goat", 10);
	goat.tell();
	Animal deer = new Animal ("Carnivore", "Deer", 50);
	deer.tell();
	Animal hyena = new Animal ("Carnivore", "Hyena", 10);
	hyena.tell();
	Animal buff = new Animal ("Carnivore", "Buffalo", 100);
	buff.tell();
	Animal sparrow = new Animal ("Omnivore", "Sparrow", 1);
	sparrow.tell();
	}

}
