package Day3;
import java.util.Scanner;
public class Day3_NestedStatements {

	public static void main(String[] args) {
		System.out.println("Inout your age:");
		Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int age = Integer.parseInt(s);
        if  (age >= 18) {
        	System.out.println("You are an adult");
        	System.out.println("What's your hobby or fav thing u do from childhood? ");
        	String hobby = in.nextLine();
        	if (hobby.equals("Gaming")) {
        		System.out.println("That is my hobby too. We are bros from another mother I believe!!");
        		}
        	else {
        		System.out.println("Nice one buddy");
        	}
        	        }
        else if (age >=13) {
        	System.out.println("You are teenager");
        	System.out.println("What's your hobby? ");
        	String hobby2 = in.nextLine();
        	if (hobby2.equals("Photography")) {
        		System.out.println("Nice hobby it's my fav but ask your parents they may always reject everthing you like, or expect something else");
        		
        	}
        	else {
        		System.out.println("Keep doing what you like and follow your heart!!");
        		
        	}
	}
        else {
        	System.out.println("You are a child");
        	System.out.println("What are u plannig on take us hobby? ");
        	String hobby3 = in.nextLine();
        	if (hobby3.equals ("Don't know")) {
        		System.out.println("Oh don't worry you got time but not enough keep that on mind!!");
        	}
        	else {
        		System.out.println("All the best and enjoy everything!!");
        	}
        }

		
	}

}
