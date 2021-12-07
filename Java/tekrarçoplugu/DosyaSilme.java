package info.mc.kitap.tekrarçoplugu;

import java.io.File;

public class DosyaSilme {
	public static void agacSil(File dizin) {
		for(File  dosya:dizin.listFiles()) {
			if(dosya.isDirectory()) {
				agacSil(dosya);
			}else {
				dosya.delete();
			}
		}
		dizin.delete();
	}
	public static void main(String[] args) {
		agacSil(new File("C:/test/"));
	}
}
