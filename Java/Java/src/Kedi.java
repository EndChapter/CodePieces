
public class Kedi extends Hayvan{
	String mamaTuru;
	public Kedi(String isim, int yas,String mamaTuru) {
		super(isim, yas);
		this.mamaTuru = mamaTuru;
	}
	@Override
	public void sesCikar()
	{
		System.out.println("Miyav, ben " + yas + " yaþýndayým.");
	}
	public void kediyeOzel()
	{
		System.out.println("Kediye Özel");
	}
	@Override
	public int islemYap(int a, int b)
	{
		int sonuc = super.islemYap(a, b);
		System.out.println(sonuc);
		return sonuc + a + b;
	}
}
