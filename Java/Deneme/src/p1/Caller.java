package p1;

public class Caller implements Runnable{
	
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ, String s) {
		// TODO Auto-generated constructor stub
		target = targ;
		msg = s;
		t= new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(target) {
			target.call(msg);
		}
		
		
	}

}
