package p1;

public class ThrowsDemo {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne");
		throw new IllegalAccessException("Edip");
	}
	public static void main(String Args[]) {
		try {
			throwOne();
		}
		catch(IllegalAccessException e) {
			System.out.println("Caught: "+ e);
		}
		
	}
}
