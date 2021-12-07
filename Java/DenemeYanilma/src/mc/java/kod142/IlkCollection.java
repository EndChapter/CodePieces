package mc.java.kod142;

import java.util.*;

public class IlkCollection {
	@SuppressWarnings("unchecked")
	public static void doldur(@SuppressWarnings("rawtypes") Collection c) {
		for (int i = 0;i<10;i++) {
			c.add("" + i);
		}
	}
	public static void main(String args[]) {
		@SuppressWarnings("rawtypes")
		Collection c = new ArrayList();
		//doldur(c);
		System.out.println(c);
	}
}
