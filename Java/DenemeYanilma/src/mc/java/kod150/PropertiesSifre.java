package mc.java.kod150;

import java.util.Properties;

public class PropertiesSifre {
	public static void main(String args[]) {
		Properties prop = new Properties();
		prop.setProperty("Kullanici adi", "test1");
		prop.setProperty("Sifre", "Bir þifre iste ne soruyorsun");
		
		System.out.println(prop.getProperty("Kullanici adi"));
		System.out.println(prop.getProperty("Password"));
	}
}
