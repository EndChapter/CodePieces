package mc.java.kod125;

public class InterruptThread {
	public static void main(String args[]) {
		Thread t = new Thread() {
			public void run() {
				System.out.println("Thread basladi");
				while(!isInterrupted()) {
					System.out.println("Thread calisiyor");
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						interrupt();
						System.out.println("Uyku modu kesildi");
					}
				}
				System.out.println("Thread Bitti");
			}
		};
		try {
			t.start();
			Thread.sleep(2000);
			t.interrupt();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
