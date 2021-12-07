package com.deneme.kitap;
import java.util.regex.Pattern;
public class Kume {
	public static void main(String args[]) {
		System.out.println(Pattern.matches("[01]*", "0"));
		System.out.println(Pattern.matches("[01]*", "01001"));
		System.out.println(Pattern.matches("[0123456789]+", "1977"));
		System.out.println(Pattern.matches("[0123456789]?", "1977"));
	}
}
