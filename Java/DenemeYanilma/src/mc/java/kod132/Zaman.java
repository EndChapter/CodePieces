package mc.java.kod132;

import java.util.Timer;

public class Zaman {
	public static void main(String args[]) {
		Timer timer = new Timer();
		timer.schedule(new ZamanTask(), 2000);
		timer.schedule(new ZamanTask(), 1000, 5000);
	}
}
