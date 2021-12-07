package DeadLock;

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();
	public DeadLock() {
		// TODO Auto-generated constructor stub
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "Racing Thread");
		t.start();
		a.foo(b);
		System.out.println("Back in main thread");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.bar(a);
		
		System.out.println("Back in other thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeadLock();
	}

}
