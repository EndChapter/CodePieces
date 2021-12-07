package com.deneme.kitap;
import java.io.*;
import java.util.Scanner;
public class TokenBul {
	public static void main(String args[]) throws FileNotFoundException{
		String text = "Duzgun yazim daha mantikli";
		Scanner sc = new Scanner(text).useDelimiter("\\s");
		System.out.println(sc.findInLine("daha"));
		System.out.println(sc.next());
	}
}
