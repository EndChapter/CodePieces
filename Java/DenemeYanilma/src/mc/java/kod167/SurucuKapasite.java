package mc.java.kod167;

import java.io.File;

public class SurucuKapasite {
	public static void main(String args[]) {
		File f1 = new File("C:\\test1");
		f1.mkdir();
		File f2 = new File("C:\\test2");
		f2.mkdir();
		f1.renameTo(new File("C:\\test"));
	}
}
