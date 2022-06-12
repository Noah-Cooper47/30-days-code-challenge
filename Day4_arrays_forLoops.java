package Day4;
import java.util.Scanner;
public class Day4_arrays_forLoops {

	public static void main(String[] args) {
		//array method 1
	 String [] greetings = new String [4];
	 greetings [0] = "Hello";
	 greetings [1] = "Hi";
	 greetings [2] = "Heya";
	 greetings [3] = "Howdy";
	 String x = greetings [0];
	 String y = greetings [1];
	 String z = greetings [2];
	 String w = greetings [3];
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(z);
	 System.out.println(w);
	 
	 // array method 2 using for loop
	 int [] nums = {8, 7, 6, 5, 4, 3, 2, 1, 8};
	 for (int i = 0; i < nums.length; i++) {
		 if (nums[i] == 1) {
			 System.out.println("Found 1 at index " + i);
		 }
		 else if (nums[i] == 2) {
			 System.out.println("Found 2 at index " + i);
		 }
		 else if (nums[i] == 3) {
			 System.out.println("Found 3 at index " + i);
		 }
		 else if (nums[i] == 4) {
			 System.out.println("Found 4 at index " + i);
		 }
		 else if (nums[i] == 5) {
			 System.out.println("Found 5 at index " + i);
		 }
		 else if (nums[i] == 6) {
			 System.out.println("Found 6 at index " + i);
		 }
		 else if (nums[i] == 8) {
			 System.out.println("Found 8 at index " + i);
		 }
		 else  {
			 System.out.println("Found 7 at index " + i);
		 }
		 
	 }
	}

}
