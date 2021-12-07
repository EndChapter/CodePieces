package mc.java.kod167;

import java.io.*;

public class DosyaOkuText {
	public static void main(String args[]) {
		Reader reader = null;
		try {
			reader = new FileReader("C:/test/hava.txt");
			for(int c;(c= reader.read())!=-1;) {
				System.out.print((char)c);
			}
		}catch(IOException e) {
				e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(Exception e) {
				
			}
		}
	}
}
