package mc.java.kod134;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public class OlumculKilit {
	static Lock lock1 = new ReentrantLock(), lock2 = new ReentrantLock();
	static class T1 extends Thread{
		public void run() {
			lock1.lock();
			System.out.println("T1: lock1 ile kilitlendi");
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e) {
			}
			lock2.lock();
			System.out.println("T1: lock2 ile kilitlendi");
			lock2.unlock();
			lock1.unlock();
		}
	}
	static class T2 extends Thread{
		public void run() {
			lock2.lock();
			System.out.println("T2: Lock2 ile kilitlendi");
			lock1.lock();
			System.out.println("T1: Lock1 ile kilitlendi");
			lock1.unlock();
			lock2.unlock();
		}
	}
	public static void main(String args[]) {
		new T1().start();
		new T2().start();
	}
}
