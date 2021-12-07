
public class GenDemo {
	public static void main(String args[]) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.ShowType();
		int v = iOb.getob();
		System.out.println("Value: " + v);
		
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Generic tests");
		
		strOb.ShowType();
		
		String str = strOb.getob();
		System.out.println("Value : " + str);
	}
}
