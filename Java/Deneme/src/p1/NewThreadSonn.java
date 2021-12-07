package p1;

public class NewThreadSonn extends Thread {
	NewThreadSonn(){
		super("Demo Thread");
		System.out.println("Child Threat: "+ this);
		this.getName();
		start();
		
	}
	public void run() {
		try {
			for(int i = 5;i>0;i--) {
				System.out.println("Child Thread" + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting child thread");
	}
}
