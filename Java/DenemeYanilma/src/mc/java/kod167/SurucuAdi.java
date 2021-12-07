package mc.java.kod167;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class SurucuAdi {
	public static void main(String args[]) {
		FileSystemView view = FileSystemView.getFileSystemView();
		for(File f:File.listRoots()) {
			System.out.println(view.getSystemDisplayName(f));
		}
	}
}
