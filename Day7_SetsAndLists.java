package Day7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Day7_SetsAndLists {

	public static void main(String[] args) {
	//Sets and its operations
		Set <Integer> msg = new HashSet <Integer>();
		msg.add(4);
		msg.add(7);
		msg.add(8);
		msg.add(2);
		msg.remove(2);
		int x = msg.size();
		System.out.println(msg);
		System.out.println(x);
		//TreeSet
		Set <Integer> msg0 = new TreeSet <Integer>();
		msg0.add(4);
		msg0.add(7);
		msg0.add(8);
		msg0.add(2);
		msg0.remove(2);
		int y = msg0.size();
		System.out.println(msg0);
		System.out.println(y);
		
		//Lists and operations
		ArrayList <Integer> msg2 = new ArrayList <Integer>();
		msg2.add(4);
		msg2.add(7);
		msg2.add(8);
		msg2.add(2);
		msg2.remove(2);
		msg2.set(2,0);
		int z = msg2.size();
		System.out.println(msg2);
		System.out.println(z);
	}

}
