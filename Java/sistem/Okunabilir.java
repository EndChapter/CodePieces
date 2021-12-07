package info.mc.kitap.sistem;

import java.io.File;
import java.io.IOException;

public class Okunabilir {
	
	public static void main(String args[]) {
		try {
			File dosya = File.createTempFile("bir", "dosya");
			System.out.printf("okunabilir=%s, yazilabilir=%s%n", dosya.canRead(), dosya.canWrite());
			dosya.setReadOnly();
			System.out.printf("okunabilir=%s, yazilabilir=%s%n", dosya.canRead(), dosya.canWrite());
			dosya.deleteOnExit();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
