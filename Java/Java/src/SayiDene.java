
public class SayiDene {

	public static void main(String[] args) {
		SayiListesi liste = new SayiListesi(5);
		liste.listeyeEkle(1);
		liste.listeyeEkle(11);
		liste.listeyeEkle(5);
		liste.listeyeEkle(3);
		liste.listeyeEkle(0);
		liste.BubbleSort();
		liste.yaz();
	}

}
