package mc.java.kod1;

public class StaticIcSinif {
	static String icSinif = "Ic Sinif";
	
	static class IcSinif{
		void yaz() {
			System.out.println(icSinif);
		}
	}
	
	public static void main(String args[]) {
		IcSinif icsinif = new StaticIcSinif.IcSinif();
		icsinif.yaz();
	}
}
