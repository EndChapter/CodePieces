package p1;

public class Clicker implements Runnable{
	int click = 0 ;
	Thread t;
	private volatile boolean running = true;
	public Clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(running) {
			click++;
		}
	}
	public void stop() {
		running = false;
	}
	public void start() {
		t.start();
	}
	
}
