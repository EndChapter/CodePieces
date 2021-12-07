package mc.java.kod125;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UykucuThread {
	public static void main(String args[]) {
		System.out.println("Ben Uyuyorum " + new Date());
		new Thread() {
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(2);
					Thread.sleep(2000);
					System.out.println("Uyanma Zamani "+ new Date());
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
