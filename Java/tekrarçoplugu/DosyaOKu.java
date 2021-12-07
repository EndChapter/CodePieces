package info.mc.kitap.tekrarçoplugu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DosyaOKu {
	public static void main(String args[]) {
		try {
			String dosyaAdi = "c:/test/test.txt";
			File klasor = new File("c:/test/");
			File dosya = new File(dosyaAdi);
			if(!klasor.exists())
				klasor.mkdir();
			if(!dosya.exists())
				dosya.createNewFile();
			else
				System.out.println("Dosya zaten mevcut");
			byte[] bellek = new byte[(int)dosya.length()];
			InputStream in = new FileInputStream(dosya);
			in.read(bellek);
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
