package mc.java.kod167;

import java.io.File;
import java.io.IOException;

public class Okunabilir {
	public static void main(String args[]) {
		try {
			File dosya = File.createTempFile("Bir","dosya");
			System.out.printf("Okunabilir=%s, yazilabilir= %s%n",dosya.canRead(),dosya.canWrite());
			dosya.setReadOnly();
			System.out.printf("Okunabilir=%s, yazilabilir= %s%n",dosya.canRead(),dosya.canWrite());
			dosya.deleteOnExit();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
