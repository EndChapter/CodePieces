package mc.java.kod167;

import java.io.File;
import java.io.IOException;

public class DosyaOlusturma {
	public static void main(String args[]) {
		String dosyaAdi = "C:\\Users\\Administrator\\Desktop\\deneme.txt";
		File f = new File(dosyaAdi);
		if(f.exists()) {
			if(f.setLastModified(System.currentTimeMillis()+99332323))
				System.out.println("Dosya yeni tarih olustur: " + dosyaAdi);
			else
				System.out.println("Dosya olusturulamadi: "+dosyaAdi);
			}
		else {
			try {
				f.createNewFile();
				System.out.println("Dosya olustur" + dosyaAdi);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
