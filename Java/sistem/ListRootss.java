package info.mc.kitap.sistem;

import java.io.File;

public class ListRootss {
	public static void main(String[] args) {
		for(File anaDizin: File.listRoots()) {
			System.out.println(anaDizin.getAbsolutePath() + " aktif " + (anaDizin.exists()  ? "" : "degil)"));
		}
	}
}
