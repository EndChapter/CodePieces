package DeadLock;

public class B {
	// TODO Auto-generated constructor stub
	synchronized void bar(A a) {
		String name =Thread.currentThread().getName();
		System.out.println(name + "Entered B.foo");
		try {
			Thread.sleep(1000);
			
		}catch(Exception e) {
			System.out.println("B Interrupted");
		}
		System.out.println(name +" Trying to call A.last()");
		a.last();
	}
	synchronized void last() {
		System.out.println("Inside B.last()");
	}
}
