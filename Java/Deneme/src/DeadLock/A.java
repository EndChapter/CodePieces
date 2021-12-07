package DeadLock;

public class A {
		// TODO Auto-generated constructor stub
		synchronized void foo(B b) {
			String name =Thread.currentThread().getName();
			System.out.println(name + "Entered A.foo");
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				System.out.println("A Interrupted");
			}
			System.out.println(name +" Trying to call B.last()");
			b.last();
		}
		synchronized void last() {
			System.out.println("Inside A.last()");
		}

}
