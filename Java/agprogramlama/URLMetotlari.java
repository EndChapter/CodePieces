package info.mc.kitap.agprogramlama;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMetotlari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL ("http://www.musa-cavus.com:1977" + "/java/kitap/index.html?anahtar=kilit");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
			System.out.println(url.getFile());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
		
		
		
		
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
