package p1;

public class Consumer implements Runnable {
	Q q;
	public Consumer(Q q) {
		// TODO Auto-generated constructor stub
		this.q  = q;
		new Thread(this,"Consumer").start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			q.get();
		}
	}

}
