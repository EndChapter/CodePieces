package p1;

public class HiLoPri {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker(1);
		Clicker lo = new Clicker(9);
		
		lo.start();
		hi.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Main Thread interrupted.");
		}
		hi.stop();
		lo.stop();
		try {
			hi.t.join();
			lo.t.join();
		}catch(InterruptedException e) {
			System.out.println("Interruped Exception Caught.");
		}
		System.out.println("Low Priority Thread: " + lo.click);
		System.out.println("High Priority Thread: " + hi.click);
	}
}
