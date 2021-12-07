package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class CarpimClient {
	public static void main(String[] args) {
		Socket server = null;
		try {
			server = new Socket("localhost", 23453);
			Scanner giris = new Scanner(server.getInputStream());
			PrintWriter cikis = new PrintWriter(server.getOutputStream(), true);
			cikis.println("20");
			cikis.println("3");
			System.out.println(giris.nextLine());
			server = new Socket("localhost", 23453);
			giris = new Scanner(server.getInputStream());
			cikis = new PrintWriter(server.getOutputStream(), true);
			cikis.println("9734789234");
			cikis.println("21372376");
			System.out.println(giris.nextLine());
			giris.close();
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(server != null) {
				try {
					server.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
