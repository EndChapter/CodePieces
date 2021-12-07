package mc.java.kod125;

public class Tarih implements Runnable{
	public void run() {
		for(int i = 100;i>0;i--) {
			System.out.println(new java.util.Date());
		}
	}
}
