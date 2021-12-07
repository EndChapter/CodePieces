package p1;

public class ThreadDemo {
	public static void main(String[] args) {
		new NewThread("name");
		Thread t = Thread.currentThread();
		System.out.println(t);
		try {
			for(int i = 5;i>0;i--) {
				System.out.println("Main Thread" + i);
				Thread.sleep(50);
				
			}
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main thread");
	}
}
