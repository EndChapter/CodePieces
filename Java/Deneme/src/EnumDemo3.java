
public class EnumDemo3 {
	
	
	public static void main(String[] main) {
		System.out.println("Winesap costs"+apple.WineSap.getPrice() + " cents.\n");
		System.out.println("All apple prices:");
		for(apple a: apple.values()) {
			System.out.println(a + " costs" + a.getPrice() + " Cents");
		}
	}
}
