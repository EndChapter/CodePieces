package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String args[]) throws IOException{
		DatagramPacket paket = null;
		InetAddress ia;
		ia = InetAddress.getByName("localhost");
		int port = 12345;
		String s = "Ben UDP protokolünü kullaniyorum.";
		byte[] data = s.getBytes();
		paket = new DatagramPacket(data, data.length, ia, port);
		DatagramSocket toSocket = new DatagramSocket();
		toSocket.send(paket);
		toSocket.close();
		
	}
}
