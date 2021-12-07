
public class EnumDemo2 {
	public static void main(String[] args) {
		apple ap;
		System.out.println("Here all apple constants");
		
		apple allApples[] = apple.values();
		for(apple a: allApples) {
			System.out.println(a);
		}
		System.out.println();
		
		ap = apple.valueOf("WineSap" );
		System.out.println(ap);
	}
}
