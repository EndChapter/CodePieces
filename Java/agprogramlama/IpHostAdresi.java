package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.InetAddress;

public class IpHostAdresi {
	public static void main(String []args) {
		try {
			InetAddress inet = InetAddress.getByName("www.musa-cavus.com");
			System.out.println(inet.getCanonicalHostName());
			System.out.println(inet.getHostAddress());
			System.out.println(inet.getHostName());
			System.out.println(inet.toString());
			inet = InetAddress.getByName("74.12.79.104");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
