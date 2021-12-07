package mc.java.kod125;

import java.awt.Point;
public class KoordinatThread {
	public static void main(String args[]) {
		final Point nokta = new Point();
		Runnable r = new Runnable() {
			public void run() {
				int x = (int)(Math.random() * 1000), y = x;
				while(true) {
					nokta.x = x;
					nokta.y = y;
					int xc = nokta.x, yc = nokta.y;
					if(xc != yc)
						System.out.println("x= " + xc + " y= " + yc);
				}
			}
		};
		new Thread(r).start();
		new Thread(r).start();
	}
}
