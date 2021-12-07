package info.mc.kitap.sistem;

import java.io.File;
import java.io.IOException;

public class DosyaMetodlari {
	public static void main(String args[]) {
		try {
			File file = new File("C:\\Programlar\\dosya.txt").getCanonicalFile();
			
			System.out.println(file);
			System.out.println(file.getName());
			System.out.println(file.getPath());
			System.out.println(file.getAbsoluteFile());
			System.out.println(file.getParent());
			System.out.println(file.isAbsolute());
			System.out.println(file.canExecute());
			System.out.println(file.setExecutable(true));
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.exists());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
