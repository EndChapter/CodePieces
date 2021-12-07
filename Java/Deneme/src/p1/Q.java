package p1;

public class Q {
	int n;
	boolean valueSet = false;
	public Q() {
		// TODO Auto-generated constructor stub
	}
	synchronized int get() {
		if(!valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Interrupted Caught");
			}
		}
		System.out.println("Get: " + n);
		valueSet = false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		if(valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Exception caught");
			}
		}
		this.n  =n;
		valueSet = true;
		
		System.out.println("Put: " + n);
		notify();
	}
	

}
