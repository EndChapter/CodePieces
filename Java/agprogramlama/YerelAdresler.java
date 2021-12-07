package info.mc.kitap.agprogramlama;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class YerelAdresler {
	public static void main(String args[]) {
		try {
			Enumeration<NetworkInterface> agArayuzuEnum = NetworkInterface.getNetworkInterfaces();
			int n = 0;
			while(agArayuzuEnum.hasMoreElements()) {
				NetworkInterface agArayuzu = agArayuzuEnum.nextElement();
				System.out.println("NetworkInterface " + n++ + ": " + agArayuzu.getDisplayName());
				for(InetAddress inetAdresi: Collections.list(agArayuzu.getInetAddresses())) {
					System.out.println("Canonical Host Name: " + inetAdresi.getCanonicalHostName());
					System.out.println("IP: " + inetAdresi.getHostAddress());
					System.out.println("HostName: " + inetAdresi.getHostName());
					System.out.println("ToString: " + inetAdresi.toString());
					System.out.println("Loopback?: " + inetAdresi.isLoopbackAddress());
					System.out.println("SiteLocal?" + inetAdresi.isSiteLocalAddress());
					System.out.println();
					
				}
				
				
			}
			
			
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
	}
}
