
public class Bisiklet {
	
	private Insan binmisInsan;
	
	public Bisiklet(){
		binmisInsan = null;
	}
	public Bisiklet(Insan GelenInsan){
		binmisInsan=GelenInsan;
	}
	public void bin(Insan gelenInsan) {
		if(binmisInsan ==null) {
			binmisInsan= gelenInsan;
			System.out.println(binmisInsan.getIsim() + " bisiklete bindi!!!");
		}
		else {
			System.out.println("Zaten "+binmisInsan.getIsim() + " binmis!");
		}
	}
	public void in() {
		if(binmisInsan==null) {
			System.out.println("Zaten bisiklet boþ!");
		}
		else {
			String inenInsan = binmisInsan.getIsim();
			binmisInsan=null;
			System.out.println(inenInsan + " bisikletten indi!!");
		}
		
	}
}
