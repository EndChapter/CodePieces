package mc.java.kod125;

public class StopThread {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Thread t = new Thread() {
			public void run() {
				try {
					while(true) 
					System.out.println("Thread Yasiyor.");
				}catch(ThreadDeath td) {
					System.out.println("Thread Durduruldu.");
					throw td;
				}
			}
		};
		t.start();
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			
		}
		t.stop();
	}
}
