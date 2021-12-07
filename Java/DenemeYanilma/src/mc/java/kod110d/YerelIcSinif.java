package mc.java.kod110d;

public class YerelIcSinif {
	public static void main(String args[]) {
		final int yerelDegisken = 99;
		class IcSinif{
			IcSinif(){
				System.out.println(yerelDegisken);
			}
		}
		new IcSinif();
	}
	
}
