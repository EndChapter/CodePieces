package info.mc.kitap.dosya;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class DosyaOKu {
	public static void main(String args[]) {
		Reader reader = null;
		try {
			reader = new FileReader("c:/test/hava.txt");
			for(int c;(c = reader.read()) !=-1;)
				System.out.print((char)c);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {reader.close();}catch(IOException e) {}
		}
	}
}
