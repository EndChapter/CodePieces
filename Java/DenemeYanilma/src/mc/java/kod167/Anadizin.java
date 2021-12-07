package mc.java.kod167;

import java.io.File;

public class Anadizin {
	public static void main(String args[]) {
		for(File anadizin: File.listRoots()) {
			System.out.println(anadizin.getPath() + " aktif " + (anadizin.exists()? "" : " deðil"));
		}
	}
}
