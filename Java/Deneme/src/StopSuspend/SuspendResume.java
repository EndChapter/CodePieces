package StopSuspend;

public class SuspendResume {
	public SuspendResume() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		
		try {
			Thread.sleep(1000);
			ob1.t.suspend();
			System.out.println("Suspending thread one");
			Thread.sleep(1000);
			ob2.t.suspend();
			System.out.println("Suspending thread two");
			Thread.sleep(1000);
			ob1.t.resume();
			System.out.println("Resuming thread one");
			ob2.t.resume();
			System.out.println("Resuming thread two");
		}catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		try {
			ob1.t.join();
			ob2.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
		//stop();
	}

}
