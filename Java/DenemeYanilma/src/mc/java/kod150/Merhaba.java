package mc.java.kod150;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Merhaba{
	
	public static void main(String args[]) {
		String basename = "merhaba";
		try {
			
			ResourceBundle bundle = ResourceBundle.getBundle(basename);
			System.out.println(bundle.getString("merhaba"));
		}catch(MissingResourceException e) {
			System.out.println(e.toString());
		}
	}
}