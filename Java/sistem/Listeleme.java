package info.mc.kitap.sistem;

import java.io.File;
import java.util.Arrays;

public class Listeleme {
	public static void main(String args[]) {
		String[] liste = new File("C:\\").list();
		System.out.println(Arrays.toString(liste));
		
	}
}
