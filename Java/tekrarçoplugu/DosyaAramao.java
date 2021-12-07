package info.mc.kitap.tekrarçoplugu;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class DosyaAramao {
	public static List<File> bul(String basla, String uzanti){
		List<File> dosyalar = new ArrayList<File>(1024);
		Stack<File> dizinler = new Stack<File>();
		File ilkDizin = new File(basla);
		Pattern p = Pattern.compile(uzanti, Pattern.CASE_INSENSITIVE);
		if(ilkDizin.isDirectory())
			dizinler.push(ilkDizin);
		while(dizinler.size()>0) {
			for(File file:dizinler.pop().listFiles())
				if(file.isDirectory())
					dizinler.push(file);
				else if(p.matcher(uzanti).matches())
					dosyalar.add(file);
		}
		return dosyalar;
	}
	public static void main(String args[]) {
		String dizin = new File("C:/test/").getAbsolutePath();
		System.out.println("Aranan dizin" + dizin);
		List<File> files = DosyaAramao.bul(dizin, "(.\\.txt)");
		System.out.printf("Bulunan dosya sayisi: %d\n", files.size());
		for(File f: files)
			System.out.println(f.getAbsolutePath());
	}
}
