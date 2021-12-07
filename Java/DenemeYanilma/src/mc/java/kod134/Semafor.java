package mc.java.kod134;

import java.util.concurrent.Semaphore;

public class Semafor {
	static Semaphore semafor= new Semaphore(2, true);
	static Runnable r = new Runnable() {
		public void run() {
			while(true) {
				try {
					semafor.acquire();
					System.out.println("Thread = " + Thread.currentThread().getName() + ", hazir" + semafor.availablePermits());
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}finally {
					semafor.release();
				}
			}
		}
	};
	public static void main(String args[]) {
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}
	
}
