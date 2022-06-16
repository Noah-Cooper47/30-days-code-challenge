package Day8;

import java.util.Map;
import java.util.TreeMap;

public class Day8_Maps {
//practicing maps by mapping a string.
	public static void main(String[] args) {
		String dark = "My name is dARK_Wolf47 and I like games and photography";
		Map msg = new TreeMap();
		
		for (char k:dark.toCharArray()) {
			if (msg.containsKey(k)) {
				//prel = previous letter
				int prel = (int) msg.get(k);
				msg.put(k, prel+1);
			}
			else {
				msg.put(k, 1);
			}
			
		}
		System.out.println(msg);

	}

}
