package mc.java.kod150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorListesi {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		Collections.addAll(list, "b", "c", "d");
		ListIterator<Object> it = list.listIterator();
		it.add("a");
		
		System.out.println(list);
		it.next();
		it.remove();
		System.out.println(list);
		
		it.next();
		it.set("i");
		System.out.println(list);
		
		it = list.listIterator(list.size()-1);
		it.add("l");
		it.add("v");
		System.out.println(list);
		it.previous();
		it.remove();
		System.out.println(list);
	}
}
