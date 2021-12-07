package mc.java.kod150;

import java.util.Date;

public class TarihSimdiMetod {
	public static void main(String args[]) {
		Date tarih = new Date(31959);
		System.out.println(tarih.before(new Date()));
		System.out.println(tarih.after(new Date()));
		System.out.println((new Date()).equals(new Date()));
	}
}
