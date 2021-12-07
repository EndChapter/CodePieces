package com.deneme.kitap;

import java.math.BigDecimal;

public class Yuvarlama {
	public static void main(String args[]) {
		BigDecimal ilkSayi = BigDecimal.valueOf(28.98723823);
		BigDecimal sonSayi = BigDecimal.valueOf(2.1278343823463);
		System.out.println(ilkSayi.divide(sonSayi, 9, BigDecimal.ROUND_UP));
		System.out.println(ilkSayi.divide(sonSayi, 9, BigDecimal.ROUND_DOWN));
	}
}
