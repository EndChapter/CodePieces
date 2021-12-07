package com.deneme.kitap;

public class ObjeKopyalama implements Cloneable {
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
		o1.yas = "32";
		ObjeKopyalama o2 = o1.clone();
		o2.ad = "Cavus";
		StringBuffer sc = new StringBuffer().append(o1.ad).append(" ").append(o1.yas);
		System.out.println(sc);
		StringBuffer sb = new StringBuffer().append(o2.ad).append(" ").append(o2.yas);
		System.out.println(sb);
	}
}
