package info.mc.kitap.agprogramlama;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Date;

public class DatagramPacketEntiries {
	public static void main(String args[]) throws Exception{
		byte[] veri = new Date().toString().getBytes();
		InetAddress ia = InetAddress.getLocalHost();
		int port = 7987;
		DatagramPacket paket = new DatagramPacket(veri, veri.length, ia, port);
		
	}
}
