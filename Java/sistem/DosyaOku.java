package info.mc.kitap.sistem;

import java.io.*;

public class DosyaOku {
	public static void main(String args[]) {
		try {
			String dosyaAdi = "C:/test/test.txt";
			File dosya = new File(dosyaAdi);
			byte[] bellek = new byte[(int) dosya.length()];
			InputStream in = new FileInputStream(dosya);
			in.read(bellek);
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
