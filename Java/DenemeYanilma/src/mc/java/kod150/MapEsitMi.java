package mc.java.kod150;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class MapEsitMi {
	public static void main(String args[]) {
		Map<Point, String> map1 = new HashMap<Point, String>();
		Point p1 = new Point(10, 20);
		map1.put(p1, "Nokta p1");
		
		Map<Point, String>map2 = new HashMap<Point, String>();
		Point p2 = new Point(10,20);
		map2.put(p2, "Nokta p1");
		System.out.println(map1.equals(map2));
	}
}
