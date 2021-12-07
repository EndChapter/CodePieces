package p1;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 42;
		int b = 0;
		try {
			a=a/b;
			int c[] = {1};
			c[42] = 99;
			System.out.println("Bu yazdýrýlmayacak");
		}
		catch(ArithmeticException b1) {
			System.out.println("Divide by: " + b1);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		System.out.println("Catchten sonra devam");
	}

}
