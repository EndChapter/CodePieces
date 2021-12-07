package mc.java.kod167;

import java.io.File;

public class DosyaSilme {
	public static void dosyaSilme(File dizin) {
		for(File dosya: dizin.listFiles()) {
			if(dosya.isDirectory()) {
				dosyaSilme(dosya);
			}else {
				dosya.delete();
			}
		}
		dizin.delete();
	}
	public static void main(String args[]) {
		dosyaSilme(new File("c:/test2/"));
	}
}
