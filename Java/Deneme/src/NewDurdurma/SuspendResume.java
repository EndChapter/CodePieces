package NewDurdurma;

public class SuspendResume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		try {
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println("Suspending Thread One");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming Thread One");
			Thread.sleep(1000);
			ob2.mySuspend();
			System.out.println("Suspending Thread Two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resuming Thread Two");
			
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		try {
			ob1.t.join();
			ob2.t.join();
			
		}catch(InterruptedException e ) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}

}
