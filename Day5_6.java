package Day5_6;
import java.util.Scanner;
public class Day5_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type the passsword: " + " " + "(Hint: My val tagline)");
		int x = in.nextInt();
		//method 1
		int count = 0;
		while (x != 47) {
			System.out.println("Type the crt password!!");
			System.out.print("Type the passsword: " + " " + "(Hint: My val tagline)");
			x = in.nextInt();
			count++;
			if (count == 4) {
				System.out.println("You have tried "+ count +" " + "times");
				break;
			}
			System.out.println("So you can't try any more");
		}
		
		
		//method 2
		int y;
		do {
			System.out.print("Type the passsword: " + " " + "(Hint: My val tagline)");
		    y = in.nextInt();
		} while ( y !=47 );
			
		
		}

}
