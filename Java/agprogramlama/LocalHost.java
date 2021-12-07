package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.InetAddress;

public class LocalHost {

	public static void main(String[] args) {
		try {
			System.out.println(InetAddress.getAllByName(null));
			System.out.println(InetAddress.getLocalHost());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
