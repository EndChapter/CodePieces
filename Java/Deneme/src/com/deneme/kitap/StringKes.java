package com.deneme.kitap;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
public class StringKes {
	public static void main(String args[]) throws FileNotFoundException{
		String s = "Bir�kapi�kapanirsa�mutlak�baska�bir�kapi�acilacaktir";
		StringTokenizer sp = new StringTokenizer(s, "�");
		while(sp.hasMoreTokens()) {
			System.out.println(sp.nextToken());
		}
	}
}
