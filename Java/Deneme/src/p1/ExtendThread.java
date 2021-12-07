package p1;

public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread(null);
		
		try {
			for(int i = 5;i>0;i--) {
				System.out.println("Main Thread" + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main Interrupted");
		}
		System.out.println("Exiting Main thread");
	}

}
