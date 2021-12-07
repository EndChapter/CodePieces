package p1;

public class NewThread implements Runnable {
	Thread t;
	String name;
	NewThread(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Threat: " + t);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 5;i>0;i--) {
				System.out.println(name + " Thread: " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(name + " Interrupted");
		}
		System.out.println("Exiting "  +name + " thread");
	}
	

}
