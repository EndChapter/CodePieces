package info.mc.kitap.sistem;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class SurucuAdi {
	public static void main(String args[]) {
		for(File f : File.listRoots()) {
			System.out.println(FileSystemView.getFileSystemView().getSystemDisplayName(f));
		}
	}
}
