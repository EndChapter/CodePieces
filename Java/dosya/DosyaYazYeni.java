package info.mc.kitap.dosya;

import java.io.*;
import java.util.Date;

public class DosyaYazYeni {
	public static void main(String[] args) {
		try {
			String dizin = "c:/resimler";
			String dosya = "c:/resimler/dosya3.txt";
			File a = new File(dizin);
			if(!a.exists())
				a.mkdir();
			File b = new File(dosya);
			if(!b.exists())
				b.createNewFile();
			
			PrintWriter out = new PrintWriter("c:/resimler/dosya3.txt");
			out.println("selam millet");
			out.print("su an");
			out.printf("saat %tT.", new Date());
			out.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
