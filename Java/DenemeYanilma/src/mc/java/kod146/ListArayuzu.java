package mc.java.kod146;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		boolean b = liste1.contains("a");
		System.out.println(b);
		
		b =  liste1.containsAll(Arrays.asList("a", "B"));
		System.out.println(b);
		
		Object o = liste1.get(1);
		System.out.println(o);
		
		int i = liste1.indexOf("F");
		System.out.println(i);
		System.out.println(liste1.isEmpty());
	}
}
