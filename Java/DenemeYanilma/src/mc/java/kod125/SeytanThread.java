package mc.java.kod125;

public class SeytanThread extends Thread {
	SeytanThread(){
		setDaemon(true);
	}
	
	public void run() {
		while(true) {
			System.out.println("Thread Calisiyor");
		}
	}
	public static void main(String args[]) {
		new SeytanThread().start();
	}
}
