
public class MatOgr extends ogr implements Bil{

	public MatOgr(String isim, int no) {
		super(isim, no);
	}
	public void hesapla() {
		System.out.println("Hesaplad?m!");
	}
	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim b?l?m?m Mat!!");
	}
	@Override
	public void bilgisayardaYaz() {
		// TODO Auto-generated method stub
		System.out.println("Yazd?m");
		
	}
	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a * b + b * 2;
	}

}
