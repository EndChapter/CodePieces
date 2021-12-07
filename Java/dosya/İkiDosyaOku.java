package info.mc.kitap.dosya;

import java.io.*;

public class İkiDosyaOku {
	public static void main(String args[]) {
		try {
			InputStream s1 = new FileInputStream("c:/resimler/dosya1.txt");
			InputStream s2 = new FileInputStream("c:/resimler/dosya2.txt");
			InputStream s = new SequenceInputStream(s1, s2);
			s1.close();
			s2.close();
			s.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
