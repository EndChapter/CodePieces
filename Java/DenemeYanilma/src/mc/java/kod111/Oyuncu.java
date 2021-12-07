package mc.java.kod111;

public class Oyuncu {
	String sehir;
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o==this) {
			return true;
		}
		Oyuncu o1 = (Oyuncu)o;
		return o1.sehir.equals(this.sehir);
	}
	public int hashCode() {
		int donus;
		donus = 2 * ((sehir==null) ? 0 : sehir.hashCode());
		
		return donus;
	}
	public static void main(String[] args) {
		Oyuncu o1 = new Oyuncu();
		o1.sehir = "Konya";
		Oyuncu o2 = new Oyuncu();
		o2.sehir = "Balikesir";
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
		
		o2.sehir = "Konya";
		System.out.println();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
	}
}
