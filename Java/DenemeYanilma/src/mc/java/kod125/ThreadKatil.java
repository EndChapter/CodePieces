package mc.java.kod125;

public class ThreadKatil {
	static class JoinerThread extends Thread{
		public int deger;
		public void run() {
			while(1>0)
				deger = 1;
		}
	}
	public static void main(String args[]) throws InterruptedException {
		JoinerThread t = new JoinerThread();
		t.start();
		t.join(2000);
		System.out.println(t.deger);
		System.gc();
	}
}
