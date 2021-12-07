package mc.java.kod110e;

import java.awt.Point;

public class AnonymSinif {
	public void main(String args[]) {
		@SuppressWarnings("serial")
		Point nokta = new Point(50, 98) {
			public String toString() {
				return "(" + x + "," + y + ")"; 
			}
		};
		System.out.println(nokta);
	}
}
