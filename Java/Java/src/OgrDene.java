
public class OgrDene {

	public static void main(String[] args) {
		Bil o1 = new FenOgr("Ali",2);
		Bil o2 = new MatOgr("Ayþe",3);
		Ciz o3 = new PsiOgr("Veli", 33);
		
		((ogr) o1).adSoyle();
		((ogr) o2).adSoyle();
		o2.bilgisayardaYaz();
		o1.bilgisayardaYaz();
		((PsiOgr) o3).ciz();
		((FenOgr) o1).ciz();
	}

}
