
public class Hayvan {
	int yas;
	String isim;
	public Hayvan() 
	{
		
	}
	public Hayvan(String isim, int yas)
	{
		this.isim =isim;
		this.yas = yas;
	}
	public void yuru() {
		System.out.println("Y�r�d�m.");
	}
	public void yasSoyle() {
		System.out.println("Ya��m: "+ yas);
	}
	public void sesCikar() {
		System.out.println("Ben bir hayvan�m!");
	}
	public int islemYap(int a, int b) {
		System.out.println(a + " * " + (b + 3));
		return a * (b+3);
	}
}
