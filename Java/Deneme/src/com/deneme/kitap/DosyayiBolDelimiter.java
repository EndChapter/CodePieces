package com.deneme.kitap;

import java.io.*;
import java.util.Scanner;
public class DosyayiBolDelimiter {
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc = new Scanner(new File ("C:\\deneme.txt"));
		sc.useDelimiter("\\s");
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		
	}
}
