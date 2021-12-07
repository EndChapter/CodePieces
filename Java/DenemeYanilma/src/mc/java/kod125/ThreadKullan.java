package mc.java.kod125;

public class ThreadKullan {
	public static void main(String args[]) {
		Thread t1 = new Thread(new Tarih());
		t1.start();
		Thread t2 = new Thread(new Sayac());
		t2.start();
	}
}
