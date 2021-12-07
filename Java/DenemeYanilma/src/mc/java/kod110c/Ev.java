package mc.java.kod110c;

public class Ev {
	String s = "Ev";
	class Oda{
		String s = "Oda";
		class Sandalye{
			String s = "Sandalye";
			void yaz() {
				System.out.println(s);
				
				System.out.println(this.s);
				
				System.out.println(Sandalye.this.s);
				
				System.out.println(Oda.this.s);
				
				System.out.println(Ev.this.s);
			}
		}
	}
	public static void main(String args[]) {
		new Ev().new Oda().new Sandalye().yaz();
	}
}
