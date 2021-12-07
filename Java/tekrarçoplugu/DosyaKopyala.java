package info.mc.kitap.tekrarçoplugu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DosyaKopyala {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dosyaKopyala("C:/test/test.txt", "c:/test/testkopya.txt");
	}
	static void kopyala(InputStream in, OutputStream out) throws IOException{
		byte[] bellek = new byte[0xFFFF];
		for(int uzunluk;(uzunluk = in.read(bellek))!= -1;)
			out.write(bellek,0, uzunluk);
	}
	static void dosyaKopyala(String src, String dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			kopyala(fis, fos);
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}
}
