package p1;

public class VarArgs {
	static void vaTest(int... v) {//Vden sonra de�er atanmaz!
		System.out.print("Number of args: " + v.length + " Contents: ");
		for(int x:v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}
