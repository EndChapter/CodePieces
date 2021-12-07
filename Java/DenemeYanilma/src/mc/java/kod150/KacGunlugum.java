package mc.java.kod150;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KacGunlugum {
	public static void main(String args[]) {
		int gun = 05;
		int ay = Calendar.NOVEMBER;
		int yil = 2001;
		long ms = new GregorianCalendar(yil, ay, gun).getTimeInMillis();
		long gunler = (System.currentTimeMillis() - ms)/(1000*60*60*24);
		System.out.println(gunler);
	}
}
