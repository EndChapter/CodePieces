package mc.java.kod167;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDosyaOku {
	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("C:/test/test.txt", "rw");
			file.seek(1);
			file.write(1);
			System.out.println(file.read());
			file.close();
			file.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
