
public class Insan {
	private int yas;
	private String isim;
	public Insan() {
		setYas(-1);
		setIsim("isimsiz");
	}
	public Insan(int alinanYas, String alinanIs�m) {
		setYas(alinanYas);
		setIsim(alinanIs�m);
	}
	public void biriniSelamla(Insan gelenInsan) {
		System.out.println("Merhaba, "+ gelenInsan.getIsim() +" benim ad�m " + isim +". Nas�ls�n?" );
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
