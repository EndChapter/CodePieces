package mc.java.kod167;

import java.io.File;
import java.util.Date;


public class OkumaYazma {
	public static void main(String args[]) {
		File file = new File("C:\\test.txt");
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.length());
		System.out.println(new Date(file.lastModified()));
	}
}
