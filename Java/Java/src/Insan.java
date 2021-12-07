
public class Insan {
	private int yas;
	private String isim;
	public Insan() {
		setYas(-1);
		setIsim("isimsiz");
	}
	public Insan(int alinanYas, String alinanIsým) {
		setYas(alinanYas);
		setIsim(alinanIsým);
	}
	public void biriniSelamla(Insan gelenInsan) {
		System.out.println("Merhaba, "+ gelenInsan.getIsim() +" benim adým " + isim +". Nasýlsýn?" );
	}
	public void SayiSay(int baslangic, int son) {
		while(baslangic<=son) {
			System.out.println(baslangic);
			baslangic++;
		}
		
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
}
