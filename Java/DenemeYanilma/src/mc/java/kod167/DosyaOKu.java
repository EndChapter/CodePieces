package mc.java.kod167;

import java.io.*;

public class DosyaOKu {
	public static void main(String args[]) {
		try {
			String dosyaAdi = "c:/test/test.txt";
			File dosya = new File(dosyaAdi);
			byte[] bellek = new byte[(int)dosya.length()];
			InputStream in = new FileInputStream(dosya);
			in.read(bellek);
			in.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
