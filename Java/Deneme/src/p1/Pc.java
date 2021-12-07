package p1;

public class Pc {

	public static void main(String[] args) {
		Q q= new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press control c to stop");
	}

}
