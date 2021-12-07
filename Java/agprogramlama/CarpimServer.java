package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CarpimServer {
	@SuppressWarnings("resource")
	public static void baglanti(Socket client) throws IOException{
		Scanner giris = new Scanner(client.getInputStream());
		PrintWriter cikis = new PrintWriter(client.getOutputStream(), true);
		String ilkSayi = giris.nextLine();
		String sonSayi = giris.nextLine();
		cikis.println(new BigInteger(ilkSayi).multiply(new BigInteger(sonSayi)));
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException{
		ServerSocket server = new ServerSocket(1086);
		while(true) {
			Socket client = null;
			try {
				client = server.accept();
				baglanti(client);
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(client != null)
					try {
						client.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
		}
	}
}
