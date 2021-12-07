package p1;

public class ForEach {

	public static void main(String[] args) {
		int nums[] = {3, 5, 7, 9, 6, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int x:nums) {
			System.out.println("Value is: " + x);
			sum = x + sum;
		}
		

	}

}
