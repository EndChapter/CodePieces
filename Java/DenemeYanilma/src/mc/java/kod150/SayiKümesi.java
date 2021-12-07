package mc.java.kod150;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SayiKümesi {
	public static void main(String args[]) {
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(9, 8, 7, 9, 8, 7));
		for(Integer i :set)
			System.out.print(i + " ");
			System.out.println();
			System.out.println(set);
	}
}
