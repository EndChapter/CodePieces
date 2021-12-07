package mc.java.kod146;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorCollection {
	public static void main(String args[]) {
		Collection<String> liste = new LinkedList<String>();
		Collections.addAll(liste, "Ali", "Veli", "Selami");
		
		for(Iterator<String> iterator = liste.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

}
