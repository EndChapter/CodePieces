package com.deneme.kitap;
import java.util.ArrayList;
public class OyunAlani {
	public ArrayList<Oyuncu> oyuncu = new ArrayList<Oyuncu>();
	public static void main(String args[]) {
		OyunAlani oa = new OyunAlani();
		
		oa.oyuncu.add(new Oyuncu("Ali"));
		oa.oyuncu.add(new Oyuncu("Veli"));
		oa.oyuncu.add(new Oyuncu("Selami"));
		
		System.out.println(oa.oyuncu.get(1).getAd());
		
	}
}
