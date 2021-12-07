package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class AramaMotoru {
	public static void main(String[] args) {
		try {
			String arananKelime = "Kitap";
			if(args.length>0) {
				for(int i=0;i<args.length;i++) {
					arananKelime += " " + args[i];
				}
			}
			arananKelime="p=" + URLEncoder.encode(arananKelime.trim(), "UTF-8");
			URL url = new URL("http://www.google.com.tr/search?" + arananKelime);
			@SuppressWarnings("resource")
			String cikti = new Scanner(url.openStream()).useDelimiter("\\Z").next();
			System.out.println(cikti);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
