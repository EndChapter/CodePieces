package com.deneme.kitap;

import java.util.regex.Pattern;
public class RegularExpression {
	public static void main(String args[]) {
		System.out.println(Pattern.matches(".*", "Bu" + "Araba"));
		System.out.println("''Bu araba''".matches("'.*'"));
	}
}
