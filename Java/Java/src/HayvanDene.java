
public class HayvanDene {

	public static void main(String[] args) {
		Kedi k1 = new Kedi("Tekir", 10,"Et");
		Kedi k2 = new Kedi("Sarman", 1,"Makarna");
		Kopek t1 = new Kopek("Karaba�",3,8,10);
		Hayvan h1= new Hayvan("�sim", 4);
		System.out.println("i�lem sonucu: " + k1.islemYap(3, 5));
		System.out.println("i�lem sonucu: " + k2.islemYap(5, 5));
		System.out.println("i�lem sonucu: " + t1.islemYap(3, 5));
		System.out.println("i�lem sonucu: " + h1.islemYap(3, 5));
	}

}
