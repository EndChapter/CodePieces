package mc.java.kod134;

import java.awt.Point;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class KoordinatThread {
	public static void main(String[] args) {
		final Lock lock = new ReentrantLock();
		final Point nokta = new Point();
		Runnable r = new Runnable(){
			public void run() {
				int x = (int)(Math.random() * 1000), y = x;
				while(true) {
					lock.lock();
					nokta.x = x;
					nokta.y = y;
					
					lock.unlock();
					
					int xc = nokta.x, yc =nokta.y;
					if(xc!=yc) {
						System.out.println("x="+xc+", y="+yc);
					}
				}
			}
		};
		new Thread(r).start();
		new Thread(r).start();
	}
}
