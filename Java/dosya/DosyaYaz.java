package info.mc.kitap.dosya;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DosyaYaz {
	public static void main(String args[]) {
		Writer fw = null;
		try {
			fw = new FileWriter("c:/test/hava.txt");
			fw.write("Bugün hava guzel");
			fw.append(System.getProperty("line.seperator"));
			fw.append("deneme");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null)
				try {
					fw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
	}
}
