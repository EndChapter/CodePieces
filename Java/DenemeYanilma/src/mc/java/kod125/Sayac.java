package mc.java.kod125;

public class Sayac implements Runnable{
	public void run() {
		for(int i = 100;i>0;i--)
			System.out.println(i);
	}
}
