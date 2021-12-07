package mc.java.kod1;

public class Ev {
	private String sahibi = "Ben";
	class Oda{
		void tamam() {
			System.out.println(sahibi);
		}
	}
	public static void main(String args[]) {
		Oda o = new Ev().new Oda();
		o.tamam();
	}
}
