package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CloseConnection {
	public static void main(String args[]) throws Exception{
		new ServerSocket(8343);
		final Socket t = new Socket ("localhost", 8343);
		new Thread(new Runnable() {
			public void run() {
				try {
					System.out.println("Biraz sonra takilacak");
					t.getInputStream().read();
					System.out.println("Burada takildi");
				}catch(IOException e) {
					System.out.println("Takilmadan Kurtuldu");
				}
			}
		}).start();
		Thread.sleep(2000);
		t.close();
	}
}
