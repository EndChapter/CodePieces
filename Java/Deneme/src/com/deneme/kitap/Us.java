package com.deneme.kitap;
import java.util.regex.Pattern;
public class Us {
	public static void main(String args[]) {
		System.out.println(Pattern.matches(".*us.*", "Mustafa"));
		System.out.println(Pattern.matches(".*us.*", "Musa"));
	}
}
