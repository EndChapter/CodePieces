package mc.java.kod167;

import java.io.File;
import java.io.IOException;

public class DosyaMetodlari {
	public static void main(String args[]) {
		try {
			File file = new File("C:\\Programlar\\dosya.txt").getCanonicalFile();
			System.out.println(file);
			System.out.println(file.getPath());
			System.out.println(file.getName());
			System.out.println(file.getAbsoluteFile());
			System.out.println(file.getParent());
			System.out.println(file.isAbsolute());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
