package NewDurdurma;

public class NewThread implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;
	public NewThread(String threadname) {
		// TODO Auto-generated constructor stub
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New thread: " + t);
		suspendFlag=false;
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 15;i>0;i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized(this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
		}catch(InterruptedException e) {
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + " Exiting");
	}
	void mySuspend() {
		suspendFlag = true;
	}
	synchronized void myresume() {
		suspendFlag  =  false;
		notify();
	}
	
}
