package mc.java.kod134;

import java.awt.Point;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteThread {
	static ReadWriteLock lock = new ReentrantReadWriteLock();
	static Lock readLock = lock.readLock();
	static Lock writeLock = lock.writeLock();
	public static void main(String args[]) {
		final Point nokta = new Point();
		Runnable r = new Runnable() {
			public void run() {
				int x= (int)(Math.random()*1000), y = x;
				while(true) {
					writeLock.lock();
					nokta.x = x;
					nokta.y = y;
					writeLock.unlock();
					int xc = nokta.x, yc = nokta.y;
					readLock.lock();
					if(xc!=yc)
						System.out.println(" x = " + xc + " y = " + yc);
					readLock.unlock();
				}
			}
		};
		new Thread(r).start();
		new Thread(r).start();
	}
}
