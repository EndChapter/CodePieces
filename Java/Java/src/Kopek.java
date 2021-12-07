
public class Kopek extends Hayvan{
	int uykuSaati;
	int hiz;
	public Kopek(String isim, int yas, int uykuSaati, int hiz) 
		{
		super(isim, yas);	
		this.uykuSaati = uykuSaati;
		this.hiz = hiz;
		}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		super.sesCikar();
		System.out.println("Hav");
	}
	
}
