package mc.java.kod167;

import java.io.*;

public class DosyaKopyala {
	static void kopyala(InputStream in, OutputStream out) throws IOException{
		byte[] bellek = new byte[0xFFFF];
		for(int uzunluk = in.read(bellek);uzunluk!= -1;) {
			out.write(bellek, 0, uzunluk);
		}
	}
	static void dosyaKopyala(String src, String dest) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			kopyala(fis, fos);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				}catch(IOException e) {}
			}if(fos!=null) {
				try {
					fos.close();
				}catch(IOException e) {}
			}
			
		}
		
	}
	public static void main(String args[]) {
		dosyaKopyala("C:/test/test.txt","C:/test/testkopya.txt");
	}
}
