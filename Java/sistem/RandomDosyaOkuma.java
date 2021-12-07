package info.mc.kitap.sistem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDosyaOkuma {
	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("C:/test/test.txt", "rw");
			file.seek(0);
			file.writeUTF("Deneme");
			file.seek(0);
			System.out.println("" + file.readUTF());
			file.seek(0);
			file.writeUTF("deneme2");
			file.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
