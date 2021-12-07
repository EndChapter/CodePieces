package info.mc.kitap.agprogramlama;

import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Scanner;

public class SifreURL {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Authenticator.setDefault(new Authenticator() {  
					protected PasswordAuthentication 
					getPasswordAuthentication(){
					return new PasswordAuthentication("joeuser",
								"a.b.C.D".toCharArray());
					}
			});
			URL url = new URL("http://www.rahul.net/joeuser/");
			System.out.println(new Scanner(url.openStream()).useDelimiter("\\Z").next());
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
