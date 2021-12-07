package mc.java.kod150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListArayuzu {
	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("a");
		liste1.add(0, "B");
		liste1.add("c");
		List<String> liste2 = Arrays.asList("D", "E");
		liste1.addAll(3, liste2);
		liste1.add("F");
		liste1.set(5, "G");
		
		String[] array = liste1.toArray(new String[] {});
		System.out.println(array[3]);
		
		List<String> liste3 = new LinkedList<String>(liste1);
		System.out.println(liste3);
		
		System.out.println(liste1);
		liste1.remove(1);
		System.out.println(liste1);
		
		//liste1.clear();
		//System.out.println(liste1);
		liste1.retainAll(liste2);
		System.out.println(liste1);
	}
}
