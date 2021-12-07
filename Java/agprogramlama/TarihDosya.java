package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class TarihDosya {
	public static void main(String []args) {
		try {
			URL url = new URL("http://www.yeliz-cavus.com" + "/index.html");
			URLConnection con = url.openConnection();
			System.out.println("Tarih               :" + new Date(con.getDate()));
			System.out.println("En son degisiklik   :" + new Date(con.getLastModified()));
			System.out.println("Content tipi        :" + con.getContentType());
			System.out.println("Content uzunlugu    :" + con.getContentLength());
			
			
			
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
