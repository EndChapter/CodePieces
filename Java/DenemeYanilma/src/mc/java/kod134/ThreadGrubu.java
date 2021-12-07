package mc.java.kod134;

public class ThreadGrubu {
	static public void main(String args[]) {
		ThreadGroup grup = new ThreadGroup("Kahraman");
		new NormalThread(grup, "Superman").start();
		new NormalThread(grup, "Örümcek adam").start();
		Thread threadDizi[] =new Thread[grup.activeCount()];
		grup.enumerate(threadDizi);
		for(Thread t : threadDizi)
			System.out.println(t);
		System.out.println("--");
		grup.list();
	}
}
class NormalThread extends Thread{
	public NormalThread(ThreadGroup grup, String isim) {
		super(grup, isim);
	}
	public void run() {
		for(int i = 0;i<3;i++) {
			System.out.println(getName() + "Ben bir kahramanim");
		}
	}
}
