package mc.java.kod167;

import java.io.*;

public class DosyaYaz {
	public static void main(String args[]) {
		Writer fw = null;
		try{
			fw = new FileWriter("C:/test/hava.txt");
			fw.write("Bugun Hava Guzel");
			
			fw.append(System.getProperty("line.seperator"));
		}catch(IOException e) {
			System.err.println("Dosya Olusturulamadi");
		}finally {
			if(fw !=null)
				try {
					fw.close();
				}catch(IOException e) {
					
				}
		}
	}
}
