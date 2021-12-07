package mc.java.kod1;

public class Util {
	public static <T> T random(T m, T n) {
		return Math.random() > 0.3 ? m : n;
	}
	public static void main(String args[]) {
		Integer s = Util.random(new Integer(5), new Integer(3));
		System.out.println(s);
	}
}
