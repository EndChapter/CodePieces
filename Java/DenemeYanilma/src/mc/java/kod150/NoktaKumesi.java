package mc.java.kod150;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class NoktaKumesi {
	public static void main(String args[]) {
		Set<Point> set = new HashSet<Point>();
		Point p1 = new Point(), p2 = new Point();
		System.out.println(set.add(p1));
		System.out.println(set.add(p2));
		System.out.println(set.add(p1));
		System.out.println(set.contains(p1));
		System.out.println(set.contains(p2));
	}
}
