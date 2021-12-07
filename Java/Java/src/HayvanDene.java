
public class HayvanDene {

	public static void main(String[] args) {
		Kedi k1 = new Kedi("Tekir", 10,"Et");
		Kedi k2 = new Kedi("Sarman", 1,"Makarna");
		Kopek t1 = new Kopek("Karabaþ",3,8,10);
		Hayvan h1= new Hayvan("Ýsim", 4);
		System.out.println("iþlem sonucu: " + k1.islemYap(3, 5));
		System.out.println("iþlem sonucu: " + k2.islemYap(5, 5));
		System.out.println("iþlem sonucu: " + t1.islemYap(3, 5));
		System.out.println("iþlem sonucu: " + h1.islemYap(3, 5));
	}

}
