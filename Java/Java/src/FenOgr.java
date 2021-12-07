
public class FenOgr extends ogr implements Bil, Ciz{

	public FenOgr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}
	public void bil() {
		System.out.println("bildim");
	}
	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim bölümüm Fen!!");
	}
	@Override
	public void bilgisayardaYaz() {
		// TODO Auto-generated method stub
		System.out.println("Tamam, Tamam Yazdým...");
	}
	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a * b * b;
	}
	@Override
	public void ciz() {
		// TODO Auto-generated method stub
		System.out.println("Tamam, Tamam Çizdim..");
	}
}
