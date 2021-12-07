package mc.java.kod167;

import java.io.File;

public class DizinMiDosyaMi {
	public static void main(String args[]) {
		File file = new File("C:\\Programlar\\dosya.txt");
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
	}
}
