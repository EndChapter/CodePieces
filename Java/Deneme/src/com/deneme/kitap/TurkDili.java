package com.deneme.kitap;

import java.text.Collator;
import java.util.Locale;


public class TurkDili {
	static void compare(Collator col, String a, String b) {
		if(col.compare(a, b)<0) {
			StringBuilder sb = new StringBuilder().append(a).append(" < ").append(b);
			System.out.println(sb);
		}
		if(col.compare(a, b) > 0) {
			StringBuilder sb = new StringBuilder().append(a).append(" > ").append(b);
			System.out.println(sb);
		}
		if(col.compare(a, b) == 0) {
			StringBuilder sb = new StringBuilder().append(a).append(" = ").append(b);
			System.out.println(sb);
		}
		
	}
	public static void main(String args[]) {
		Collator col = Collator.getInstance(new Locale("tr"));
		System.out.println("Kural PRIMARY");
		col.setStrength(Collator.PRIMARY);
		compare(col, "abç", "abc");
		compare(col, "Turkce", "Türkçe");
		
		System.out.println("Kural SECONDARY");
		col.setStrength(Collator.SECONDARY);
		compare(col, "abç", "abc");
		compare(col, "Turkce", "Türkçe");
		
		System.out.println("Kural TERTIARY");
		col.setStrength(Collator.TERTIARY);
		compare(col, "abç", "abc");
		compare(col, "Turkce", "Türkçe");
	}
}
