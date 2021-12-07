package com.deneme.kitap;

import java.math.BigInteger;

public class Faktoriyel {
	static BigInteger faktoriyel(int tamSayi) {
		BigInteger sonuc = BigInteger.ONE;
		if(tamSayi==0|| tamSayi == 1) {
			return sonuc;
		}
		if(tamSayi>1) 
			for(int i = 1;i<=tamSayi;i++) {
				sonuc = sonuc.multiply(BigInteger.valueOf(i));
				System.out.println(sonuc);
			}
		return sonuc;
		
	}
	
	public static void main(String args[]) {
		System.out.println(faktoriyel(1232));
	}
	
}
