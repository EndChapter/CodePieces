package info.mc.kitap.sistem;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class DosyaArama{
	
	public static List<File> bul(String basla, String uzanti){
	List<File> dosyalar = new ArrayList<File>();
	Stack<File> dizinler = new Stack<File>();
	File ilkDizin = new File(basla);
	try {
			Pattern p = Pattern.compile(uzanti, Pattern.CASE_INSENSITIVE);
			if(ilkDizin.isDirectory())
				dizinler.push(ilkDizin);
			while(dizinler.size()>0)
				for(File file: dizinler.pop().listFiles())
				if(file.isDirectory())
					dizinler.push(file);
				else if(p.matcher(file.getName()).matches())
					dosyalar.add(file);
			return dosyalar;
	}catch(NullPointerException e) {
		e.printStackTrace();
		return dosyalar;
	}
		
	}
	public static void main(String args[]) {
		String dizin = new File("D:/").getAbsolutePath();
		System.out.println("Aranan dizin: " + dizin);
		List<File> files = DosyaArama.bul(dizin, ".*\\.jpg");
		System.out.printf("Bulunan dosya sayisi: %d\n", files.size());
		for(File file:files) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
