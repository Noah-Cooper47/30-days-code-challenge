package Day18;

public class Car implements Vehicle{
	 private int Gear = 1;
	 private int Speed = 0;
   
	 public void changeGear(int Gear) {
		 this.Gear = Gear;
	 }
	 public void speedUp(int change) {
		 this.Speed += change;
	 }
	 public void slowDown(int change) {
		 this.Speed -= change;
	 }
	 
	 public void display() {
		 System.out.println("Iam a car, going " + this.Speed + "km/h and I am in gear " + this.Gear);
	 }
	 
	
}

