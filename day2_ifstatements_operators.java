package Day2;
import java.util.Scanner;
public class day2_ifstatements_operators {

	public static void main(String[] args) {
	    //input from user
		Scanner	sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    
	 // if else statements 
	    if (s.equals("Noah")) {
	    	System.out.println("You have typed my name correctly");
	    	}
	    else if (s.equals("Nova")) {
	    	System.out.println("You have typed my name incorrectly. Please use 'h' in the end and remove 'v' ");
	    }
	    else if (s.equals("noah")) {
	    	System.out.println("Please use captial letter while starting a line or word");
	    }
	    else {
	    	System.out.println("You have not typed my name at all. Please check and proceed further.");
	    }
	   
	    //Operators(== , < > <= >= !=)
	    int x = 2;
	    int y = 4;
	    int z = 7;
	    boolean compare;
	    compare = x < y && y > x ;
	    System.out.println(compare);
	    compare = x < z || x > z ;
	    System.out.println(compare);
	    compare = !(x==y);
	    System.out.println(compare);
	    
	}

}
