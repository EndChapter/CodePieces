package StopSuspend;

public class NewThread implements Runnable{
	String name;
	Thread t;

	public NewThread(String threadname) {
		// TODO Auto-generated constructor stub
		name=threadname;
		t = new Thread(this, name);
		System.out.println("New thread: "+t);
		t.start();
	}
	public void run() {
		try {
			for(int i = 15;i>0;i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + " Exiting");
	}

}
