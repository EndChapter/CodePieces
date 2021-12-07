package com.deneme.kitap;
import java.util.Arrays;
import java.util.regex.Pattern;
public class WebAdresi {
	public static void main(String args[]) {
		String adres ="www.musacavus.com";
		String[] bolunmus = adres.split("\\.");
		System.out.println(Arrays.toString(bolunmus));
	}
}
