package info.mc.kitap.dosya;

import java.io.File;
import java.io.IOException;

public class DosyaOlusturma {
	public static void main(String[] args) {
		String dosyaAdi ="C:\\deneme.txt";
		File f = new File(dosyaAdi);
		if(f.exists()) {
			if(f.setLastModified(System.currentTimeMillis() + 99332323))
			System.out.println("Dosya yeni tarih oluþtur: " + dosyaAdi);
			else
				System.out.println("Dosya Olusturulamadi: " + dosyaAdi);
		}
		else {
			try {
				f.createNewFile();
				System.out.println("Dosya Olustur " + dosyaAdi);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
