package mc.java.kod146;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class StringUzunluk {
	static int uzunluk(@SuppressWarnings("rawtypes") Collection strings) {
		int result = 0;
		for(Object s:strings)
			result += ((String)s).length();
		return result;
	}
	public void main(String args[]) {
		Collection<String> liste = new LinkedList<String>();
		Collections.addAll(liste, "Ali", "Veli", "Selami");
		System.out.println(uzunluk(liste));
	}
}
