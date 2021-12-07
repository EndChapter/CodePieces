
public class MatOgr extends ogr implements Bil{

	public MatOgr(String isim, int no) {
		super(isim, no);
	}
	public void hesapla() {
		System.out.println("Hesapladým!");
	}
	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim bölümüm Mat!!");
	}
	@Override
	public void bilgisayardaYaz() {
		// TODO Auto-generated method stub
		System.out.println("Yazdým");
		
	}
	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a * b + b * 2;
	}

}
