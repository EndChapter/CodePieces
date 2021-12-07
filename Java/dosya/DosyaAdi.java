package info.mc.kitap.dosya;

import java.io.File;

public class DosyaAdi {
	public static void main(String[] args) {
		File dosya = new File("C:/");
		System.out.println(dosya);
		System.out.println(File.separatorChar);
	}
}
