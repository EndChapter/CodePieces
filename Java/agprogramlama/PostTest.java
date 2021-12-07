package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PostTest {
	public static void main(String args[]) {
		try {
			URL url = new URL("http://www.musa-cavus.com" + "/index.html");
			URLConnection con = url.openConnection();
			PrintStream o = new PrintStream(con.getOutputStream());
			o.println("merhaba");
			o.close();
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
