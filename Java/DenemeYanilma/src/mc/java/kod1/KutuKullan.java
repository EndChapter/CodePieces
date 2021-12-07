package mc.java.kod1;

public class KutuKullan {
	public static void main(String args[]) {
		Kutu<String> kutu = new Kutu<String>();
		kutu.setDeger("Yeni string degeri");
		System.out.println(kutu.getDeger());
	}
}
