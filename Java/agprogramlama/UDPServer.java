package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String args[]) throws IOException{
		DatagramSocket socket = new DatagramSocket(12345);
		while(true) {
			DatagramPacket paket = new DatagramPacket(new byte[1024], 1024);
			socket.receive(paket);
			InetAddress adres = paket.getAddress();
			int port = paket.getPort();
			int uzunluk = paket.getLength();
			byte veri[]= paket.getData();
			System.out.printf("Sorgu %s port %d uzunluk %d:%n%s%n", adres, port,uzunluk, new String(veri, 0, uzunluk));
		}
	}
}
