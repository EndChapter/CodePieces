package mc.java.kod167;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Filtreleme implements FilenameFilter{
	public boolean accept(File dosya, String dosyaAdi) {
		return new File(dosya, dosyaAdi).isFile() && dosyaAdi.toLowerCase().endsWith(".txt");
	}
	public static void main(String args[]) {
		File dizin = new File("C:\\");
		for(File sonuc:dizin.listFiles(new Filtreleme())) {
			System.out.println(sonuc);
		}
	}
}
