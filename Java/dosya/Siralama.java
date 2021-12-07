package info.mc.kitap.dosya;

import java.io.File;
import java.io.FilenameFilter;


public class Siralama implements FilenameFilter{
	public static void main(String[] args) {
		File dizin = new File("C:\\");
		for(File sonuc:dizin.listFiles(new Siralama())) {
			System.out.println(sonuc);
		}
	}

	@Override
	public boolean accept(File dir, String name) {
		
		return new File(dir, name).isFile() && name.toLowerCase().endsWith(".txt");
	}
}
