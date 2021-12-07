package mc.java.kod142;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorCollection {
	public static void main(String args[]) {
		Collection<String> liste = new LinkedList<String>();
		Collections.addAll(liste, "Ali", "Veli", "Selami");
		
		Iterator<String> iterator = liste.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
