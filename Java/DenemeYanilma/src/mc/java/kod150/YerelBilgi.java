package mc.java.kod150;

import java.util.Locale;


public class YerelBilgi {
	public static void main(String args[]) {
		Locale turkce = new Locale("tr", "TR");
		Locale[] tumlocal = Locale.getAvailableLocales();
		for(int i = 0; i<tumlocal.length;i++){
			System.out.println(i + ": " + tumlocal[i]);
		}
			System.out.println("");
		System.out.println(turkce.getLanguage());
		System.out.println(turkce.getCountry());
		System.out.println(turkce.getDisplayCountry());
		System.out.println(turkce.getDisplayLanguage());
	}
}
