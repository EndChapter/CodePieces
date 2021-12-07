package mc.java.kod111;

public class ObjeKopyalama implements Cloneable{
	public String ad;
	public String yas;
	
	public ObjeKopyalama clone() {
		try {
			return(ObjeKopyalama)super.clone();
		}catch(CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
	public static void main(String args[]) {
		ObjeKopyalama o1 = new ObjeKopyalama();
		o1.ad = "Musa";
		o1.yas= "32";
		ObjeKopyalama o2 = o1.clone();
		o2.ad="Cavus";
		System.out.println(o1.ad + o1.yas);
		System.out.println(o2.ad + o2.yas);
	}
}
