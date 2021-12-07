package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLDelimiter {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		InputStream is = null;
		try {
			URL url = new URL("http://www.musacavus.com"+ "/kitap/java/kod/temeljava/ornek.txt");
			is= url.openStream();
			System.out.println(new Scanner(is).useDelimiter("\\Z").next());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(is!= null)
				try {is.close();}catch(IOException e) {e.printStackTrace();}
		}
	}
}
