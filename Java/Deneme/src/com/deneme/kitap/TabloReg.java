package com.deneme.kitap;
import java.util.regex.Pattern;
public class TabloReg {
	public static void main(String args[]) {
		System.out.println(Pattern.matches("\\d*\\s*", "11  "));
		System.out.println(Pattern.matches("\\d*", "112a"));
		System.out.println(Pattern.matches("\\d*.", "112a"));
		System.out.println(Pattern.matches(".\\d*.", "x112a"));
	}
}
